package com.github.csegu.porrafutbol.dto;

import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDto {

    private Long resultId;
    private int goalsTeam1;
    private int goalsTeam2;
    private String result;
}
