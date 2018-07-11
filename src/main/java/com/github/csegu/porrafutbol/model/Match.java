/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.csegu.porrafutbol.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Table(name = "matchs")
@Builder(toBuilder = true)
@NoArgsConstructor
public class Match implements Serializable {
    
    @Id
    private Long matchId;
    
    private Team team1;
    
    private Team team2;
    
    private int goalsTeam1;
    
    private int goalsTeam2;
    
    private String result;
    
}
