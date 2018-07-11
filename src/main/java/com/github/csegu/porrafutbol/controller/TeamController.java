package com.github.csegu.porrafutbol.controller;

import com.github.csegu.porrafutbol.dto.TeamDto;
import com.github.csegu.porrafutbol.service.TeamService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/teams")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TeamController {
    
    private TeamService teamService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<TeamDto> obtenerEquipos() {
        return teamService.listTeams();
    }
/*
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public TeamDto obtenerUsuario(@PathVariable("id") Long id) {
        return teamService.obtenerUsuario(id);
    }

    @RequestMapping(path = "/buscar", method = RequestMethod.GET)
    public TeamDto obtenerUsuario(FiltroUsuario filtro) {
        return teamService.buscarUsuario(filtro.getNombre());
    }
*/
    @RequestMapping(method = RequestMethod.POST)
    public void insertarEquipo(@RequestBody TeamDto teamDto) {
        teamService.addTeam(teamDto);
    }
    
}
