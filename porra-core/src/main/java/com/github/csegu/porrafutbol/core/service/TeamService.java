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

    @Transactional
    public void addTeam(TeamDto teamDto) {
        Team team = new Team(teamDto.getId(), teamDto.getName(), teamDto.getShortName(), teamDto.getCountry(), teamDto.getTla());
        teamRepository.save(team);
    }

    public TeamDto getTeam(long id) {
        return map(teamRepository.findTeamById(id));
    }

    public TeamDto findTeam(String name) {
        return map(teamRepository.findTeamByName(name));
    }

    public List<TeamDto> listTeams() {
        return teamRepository.listAllTeams().stream().map(TeamService::map).collect(Collectors.toList());
    }

    public static TeamDto map(Team team) {
        TeamDto result = null;
        if (team != null) {
            result = new TeamDto(team.getId(), team.getName(), team.getCountry(), team.getShortName(), team.getTla());
        }
        return result;
    }
}
