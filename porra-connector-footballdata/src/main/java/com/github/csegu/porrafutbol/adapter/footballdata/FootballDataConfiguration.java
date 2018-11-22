package com.github.csegu.porrafutbol.adapter.footballdata;

import com.github.csegu.porrafutbol.adapter.footballdata.dto.FootballTeamResponseDto;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FootballDataConfiguration {

    @Value("${footballdata.ws.url.teams}")
    private String urlTeams;

    @Value("${footballdata.ws.auth.token}")
    private String token;

    @Value("${footballdata.ws.auth.host}")
    private String host;

    @Value("${footballdata.ws.auth.port}")
    private int port;

    @Bean("footballdataRestTemplate")
    public RestTemplate restTemplate() throws GeneralSecurityException {
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add((HttpRequest request, byte[] body, ClientHttpRequestExecution execution) -> {
            request.getHeaders().set("Accept", MediaType.APPLICATION_JSON_VALUE);
            request.getHeaders().set("X-Auth-Token", token);
            return execution.execute(request, body);
        });
        
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(interceptors);
        return restTemplate;
    }
}
