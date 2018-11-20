package com.github.csegu.porrafutbol.core.service;

import com.github.csegu.porrafutbol.core.dto.GroupDto;
import com.github.csegu.porrafutbol.core.model.Group;
import com.github.csegu.porrafutbol.core.repository.GroupRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__({
    @Autowired}))
public class GroupService {

    private GroupRepository groupRepository;

    public List<GroupDto> getAll() {
        return groupRepository.findAll().stream().map(GroupService::map).collect(Collectors.toList());
    }

    public GroupDto findById(Long id) {
        return GroupService.map(groupRepository.getOne(id));
    }

    public static GroupDto map(Group group) {
        GroupDto result = null;
        if (group != null) {
            result = new GroupDto(group.getId(), group.getGroupName(), group.getGroupTeams(), group.getGroupMatchs(), group.getGroupTable());
        }
        return result;
    }
}
