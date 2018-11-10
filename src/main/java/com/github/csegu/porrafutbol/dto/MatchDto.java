package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Group;
import com.github.csegu.porrafutbol.model.Score;
import com.github.csegu.porrafutbol.model.Team;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDto {

    private Long matchId;
    private Integer matchDay;
    private Group group;
    private LocalDate matchDate;
    private Team homeTeam;
    private Team awayTeam;
    private Score result;
    private String venue;
}
