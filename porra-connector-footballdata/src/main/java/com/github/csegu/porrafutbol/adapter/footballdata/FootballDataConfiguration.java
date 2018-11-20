package com.github.csegu.porrafutbol.adapter.footballdata;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
        
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("token", token);
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);
 
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with GET method, and Headers.
        ResponseEntity<String> response = restTemplate.exchange(urlTeams, //
                HttpMethod.GET, entity, String.class);
 
        String result = response.getBody();
 
        System.out.println(result);
        
        return null;
        
    }

}
