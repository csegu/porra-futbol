/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csg.proyectoporra.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
@Entity
@AllArgsConstructor
@Table(name = "matchs")
public class Match implements Serializable {
    
    @Id
    private Long matchId;
    
    private Team team1;
    
    private Team team2;
    
    private int goalsTeam1;
    
    private int goalsTeam2;
    
    private String result;
    
}
