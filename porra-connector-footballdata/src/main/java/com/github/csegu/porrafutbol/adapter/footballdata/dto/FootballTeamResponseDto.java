package com.github.csegu.porrafutbol.adapter.footballdata.dto;

import com.github.csegu.porrafutbol.adapter.footballdata.model.FootballDataTeam;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballTeamResponseDto {
  
    private List<FootballDataTeam> teams;
}
