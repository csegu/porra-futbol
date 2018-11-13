package com.github.csegu.porrafutbol.controller;

import com.github.csegu.porrafutbol.dto.ScoreDto;
import com.github.csegu.porrafutbol.service.ResultService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/results")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class ResultController {
    private ResultService resultService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ScoreDto>> getAll() {
         return ResponseEntity.ok(resultService.listResults());
    }
}
