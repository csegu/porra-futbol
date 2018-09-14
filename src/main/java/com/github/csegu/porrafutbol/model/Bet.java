package com.github.csegu.porrafutbol.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "bets")
@NoArgsConstructor
@AllArgsConstructor
//@ToString(exclude = "otherRef")
public class Bet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long betId;
    
    @Column
    @JoinColumn(nullable = false)
    private Match match;
    
    @Column
    private Result result;
    
    @Column
    private Integer points;
  
//    @Column(length = 10)
//    private String name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(nullable = false)
//    private Other other;

//    @Column(nullable = false, length = 10)
//    @Enumerated(EnumType.STRING)
//    private OtherEnum type;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "bet")
//    private List<OtherRef> otherRef;
}
