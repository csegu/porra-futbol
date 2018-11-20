package com.github.csegu.porrafutbol.adapter.footballdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballDataTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonProperty("area")
    private FootballDataArea area;
  
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("shortName")
    private String shortName;
    
    @JsonProperty("tla")
    private String tla;
    
    @JsonProperty("crestUrl")
    private String crestUrl;
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("phone")
    private String phone;
    
    @JsonProperty("website")
    private String website;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("founded")
    private LocalDate founded;
    
    @JsonProperty("clubColors")
    private String clubColors;
    
    @JsonProperty("venue")
    private String venue;
    
    @JsonProperty("lastUpdated")
    private LocalDateTime lastUpdated;
}
