package com.github.csegu.porrafutbol.core.dto;

import com.github.csegu.porrafutbol.core.model.GroupTable;
import com.github.csegu.porrafutbol.core.model.Match;
import com.github.csegu.porrafutbol.core.model.Team;
import java.util.List;
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
    private GroupTable groupTable;
}
