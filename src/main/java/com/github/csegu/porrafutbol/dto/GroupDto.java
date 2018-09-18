package com.github.csegu.porrafutbol.dto;

import com.github.csegu.porrafutbol.model.Match;
import com.github.csegu.porrafutbol.model.Team;
import java.util.List;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDto {

    private Long id;
    private String groupName;
    private List<Team> groupTeams;
    private List<Match> groupMatchs;
    private Table groupTable;
}
