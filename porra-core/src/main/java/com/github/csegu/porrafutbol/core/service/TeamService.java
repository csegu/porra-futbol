package com.github.csegu.porrafutbol.core.service;

import com.github.csegu.porrafutbol.core.dto.TeamDto;
import com.github.csegu.porrafutbol.core.model.Team;
import com.github.csegu.porrafutbol.core.repository.TeamRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TeamService {

    private TeamRepository teamRepository;
    
    private TeamMapper teamMapper;

    @Transactional
    public void addTeam(TeamDto teamDto) {
        Team team = TeamMapper.MAPPER.map(teamDto);
        teamRepository.save(team);
    }

    public TeamDto getTeam(long id) {
        return TeamMapper.MAPPER.map(teamRepository.findTeamById(id));
    }

    public TeamDto findTeam(String name) {
        return TeamMapper.MAPPER.map(teamRepository.findTeamByName(name));
    }

    public List<TeamDto> listTeams() {
        return teamRepository.listAllTeams().stream().map(teamMapper::map).collect(Collectors.toList());
    }

}
