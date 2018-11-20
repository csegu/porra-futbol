package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.MatchDto;
import com.github.csegu.porrafutbol.core.service.MatchService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/matchs")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MatchController {
    private MatchService matchService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<MatchDto>> obtenerPartidos() {
         return ResponseEntity.ok(matchService.listMatchs());
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void insertarPartido(@RequestBody MatchDto matchDto) {
        matchService.addMatch(matchDto);
    }
}
