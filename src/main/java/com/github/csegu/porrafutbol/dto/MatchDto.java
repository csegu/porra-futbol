package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDto {

    private Long matchId;
    private Team team1;
    private Team team2;
    private int goalsTeam1;
    private int goalsTeam2;
    private String result;
}
