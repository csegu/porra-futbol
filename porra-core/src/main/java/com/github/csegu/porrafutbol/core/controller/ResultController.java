package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.ScoreDto;
import com.github.csegu.porrafutbol.core.service.ResultService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/results")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class ResultController {
    private ResultService resultService;

    @GetMapping
    public ResponseEntity<List<ScoreDto>> getAll() {
         return ResponseEntity.ok(resultService.listResults());
    }
}
