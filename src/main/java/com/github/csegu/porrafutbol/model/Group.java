package com.github.csegu.porrafutbol.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "groups")
@NoArgsConstructor
@AllArgsConstructor
//@ToString(exclude = "otherRef")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(length = 1)
    private String groupName;

    @Column
    private List<Team> groupTeams;

    @Column
    private List<Match> groupMatchs;
    
    @Column
    private Table groupTable;

}
