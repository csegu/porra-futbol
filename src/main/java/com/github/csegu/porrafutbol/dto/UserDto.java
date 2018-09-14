package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Bet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long userId;
    private String userName;
    private Bet userBets;
    private Integer userPoints;
}
