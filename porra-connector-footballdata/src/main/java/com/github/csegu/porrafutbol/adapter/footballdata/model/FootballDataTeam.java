package com.github.csegu.porrafutbol.adapter.footballdata.model;

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
    
    private FootballDataArea area;
  
    private String name;
    
    private String shortName;
    
    private String tla;
    
    private String crestUrl;
    
    private String address;
    
    private String phone;
    
    private String website;
    
    private String email;

    private LocalDate founded;
    
    private String clubColors;
    
    private String venue;
    
    private LocalDateTime lastUpdated;
}
