package com.github.csegu.porrafutbol.controller;

import com.github.csegu.porrafutbol.dto.GroupDto;
import com.github.csegu.porrafutbol.service.GroupService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/groups")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class GroupController {
    private GroupService groupService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<GroupDto>> getAll() {
         return ResponseEntity.ok(groupService.getAll());
    }
}
