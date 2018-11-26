package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.TeamDto;
import com.github.csegu.porrafutbol.core.service.TeamService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/teams")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TeamController {
    
    private TeamService teamService;
    
    @GetMapping
    public List<TeamDto> obtenerEquipos() {
        return teamService.listTeams();
    }

   @PostMapping
    public void insertarEquipo(@RequestBody TeamDto teamDto) {
        teamService.addTeam(teamDto);
    }
    
}
