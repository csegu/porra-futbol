package com.github.csegu.porrafutbol.adapter.footballdata.services;

import com.github.csegu.porrafutbol.adapter.footballdata.model.FootballDataTeam;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class FootballDataWsService {
    
    @Value("${footballdata.ws.url.teams}")
    private String urlTeams;

    @Value("${footballdata.ws.header.token}")
    private String token;
    
    private RestTemplate restTemplate = new RestTemplate();

    public FootballDataWsService() {
        restTemplate.getInterceptors().add((request, body, execution) -> {
            ClientHttpResponse response = execution.execute(request, body);
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            return response;
        });
    }

    private HttpHeaders buildHeader() {
        HttpHeaders header = new HttpHeaders();
        header.add("X-Auth-Token", token);
        return header;
    }
    
    public List<FootballDataTeam> obtenerDetalleEquipos() {
        //return restTemplate.exchange(urlTeams, HttpMethod.GET, new HttpEntity<>(null, buildHeader()), FootballDataTeam.class).getBody();
        return Arrays.asList(restTemplate.getForObject(urlTeams, FootballDataTeam[].class)).stream().collect(Collectors.toList());
    }
}