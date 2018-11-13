package com.github.csegu.porrafutbol.service;

import com.github.csegu.porrafutbol.dto.GroupTableDto;
import com.github.csegu.porrafutbol.model.GroupTable;
import com.github.csegu.porrafutbol.repository.GroupTableRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class GroupTableService {
    private GroupTableRepository groupTableRepository;

    public List<GroupTableDto> getAll() {
        return groupTableRepository.findAll().stream().map(GroupTableService::map).collect(Collectors.toList());
    }

    public GroupTableDto findById(Long id) {
        return GroupTableService.map(groupTableRepository.getOne(id));
    }

    public static GroupTableDto map(GroupTable groupTable) {
        GroupTableDto result = null;
        if (groupTable != null) {
            result = new GroupTableDto(groupTable.getId(), groupTable.getTableTeams(), groupTable.getTableMatchs(), groupTable.getMatchsPlayed(), 
                    groupTable.getMatchsWon(), groupTable.getMatchsTied(), groupTable.getMatchsLost(), groupTable.getGoalsDifference(), groupTable.getPoints());
        }
        return result;
    }
}