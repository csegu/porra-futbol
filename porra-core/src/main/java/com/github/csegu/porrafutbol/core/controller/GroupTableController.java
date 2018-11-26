package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.GroupTableDto;
import com.github.csegu.porrafutbol.core.service.GroupTableService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/group-tables")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class GroupTableController {
    private GroupTableService groupTableService;

    @GetMapping
    public ResponseEntity<List<GroupTableDto>> getAll() {
         return ResponseEntity.ok(groupTableService.getAll());
    }
}
