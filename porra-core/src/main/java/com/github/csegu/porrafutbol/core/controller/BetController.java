package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.BetDto;
import com.github.csegu.porrafutbol.core.service.BetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bets")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class BetController {
    private BetService betService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BetDto>> getAll() {
         return ResponseEntity.ok(betService.listBets());
    }
}
