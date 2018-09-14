package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Match;
import com.github.csegu.porrafutbol.model.Result;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BetDto {

    private Long betId;
    private Match match;
    private Result result;
    private Integer points;
}
