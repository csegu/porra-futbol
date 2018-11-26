package com.github.csegu.porrafutbol.core.controller;

import com.github.csegu.porrafutbol.core.dto.UserDto;
import com.github.csegu.porrafutbol.core.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UserController {
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
         return ResponseEntity.ok(userService.listUsers());
    }
}
