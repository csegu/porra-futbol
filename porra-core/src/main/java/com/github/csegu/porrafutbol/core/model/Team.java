package com.github.csegu.porrafutbol.core.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "teams")
@Builder(toBuilder = true)
@NoArgsConstructor
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32, nullable = false, unique = true)
    private String name;
    
    @Column
    private String shortName;
    
    @Column
    private String country;
    
    @Column
    private String tla;
    
    @Column
    private String crestUrl;
    
    @Column
    private String address;
    
    @Column
    private String phone;
    
    @Column
    private String website;
    
    @Column
    private String email;
    
    @Column
    private LocalDate founded;
    
    @Column
    private String clubColors;
    
    @Column
    private String venue;
    
    @Column
    private LocalDateTime lastUpdated;

}
