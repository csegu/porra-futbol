package com.github.csegu.porrafutbol.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "group_tables")
@NoArgsConstructor
@AllArgsConstructor
public class GroupTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(length = 10)
    private List<Team> tableTeams;

    @Column
    private List<Match> tableMatchs;
    
    @Column
    private Integer matchsPlayed;
    
    @Column
    private Integer matchsWon;
    
    @Column
    private Integer matchsTied;
    
    @Column
    private Integer matchsLost;
    
    @Column
    private Integer goalsDifference;
    
    @Column
    private Integer points;

}
