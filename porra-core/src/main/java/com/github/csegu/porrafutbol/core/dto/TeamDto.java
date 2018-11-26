package com.github.csegu.porrafutbol.core.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private Long id;
    private String name;
    private String shortName;
    private String country;
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
