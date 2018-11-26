package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.GroupDto;
import com.github.csegu.porrafutbol.core.service.GroupService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/groups")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class GroupController {
    private GroupService groupService;

    @GetMapping
    public ResponseEntity<List<GroupDto>> getAll() {
         return ResponseEntity.ok(groupService.getAll());
    }
}
