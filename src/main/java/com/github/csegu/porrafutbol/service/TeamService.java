/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.csegu.porrafutbol.service;

import com.github.csegu.porrafutbol.dto.TeamDto;
import com.github.csegu.porrafutbol.model.Team;
import com.github.csegu.porrafutbol.repository.TeamRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
@Service
public class TeamService {
    
    @Autowired
    private TeamRepository teamRepository;
    
    @Transactional
    public void addTeam(TeamDto teamDto) {
        Team team = new Team(teamDto.getId(), teamDto.getName());
        teamRepository.save(team);
    }
    
    public TeamDto getTeam(long id) {
        return map(teamRepository.findTeamById(id));
    }
    
    public TeamDto findTeam(String name) {
        return map(teamRepository.findTeamByName(name));
    }
    
    public List<TeamDto> listTeams() {
        return teamRepository.ListAllTeams().stream().map(TeamService::map).collect(Collectors.toList());
    }
    
    public static TeamDto map(Team team){
        
        return new TeamDto(team.getId(), team.getName());
    }
    
}
