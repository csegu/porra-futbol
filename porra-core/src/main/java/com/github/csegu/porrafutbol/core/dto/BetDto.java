package com.github.csegu.porrafutbol.core.dto;

import com.github.csegu.porrafutbol.core.model.Match;
import com.github.csegu.porrafutbol.core.model.Score;
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
    private Score result;
    private Integer points;
}
