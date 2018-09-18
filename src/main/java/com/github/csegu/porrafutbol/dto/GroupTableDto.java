package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Match;
import com.github.csegu.porrafutbol.model.Team;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupTableDto {

    private Long id;
    private List<Team> tableTeams;
    private List<Match> tableMatchs;
    private Integer matchsPlayed;
    private Integer matchsWon;
    private Integer matchsTied;
    private Integer matchsLost;
    private Integer goalsDifference;
    private Integer points;
}
