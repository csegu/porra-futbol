package com.github.csegu.porrafutbol.adapter.footballdata.services;

import com.github.csegu.porrafutbol.adapter.footballdata.dto.FootballTeamResponseDto;
import com.github.csegu.porrafutbol.adapter.footballdata.model.FootballDataTeam;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class FootballDataWsService {
    
    @Value("${footballdata.ws.url.teams}")
    private String urlTeams;

    @Autowired
    private RestTemplate restTemplate;

    public List<FootballDataTeam> obtenerDetalleEquipos() {
        return restTemplate.getForObject(urlTeams, FootballTeamResponseDto.class).getTeams();
    }
} 