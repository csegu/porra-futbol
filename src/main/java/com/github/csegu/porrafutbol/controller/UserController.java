package com.github.csegu.porrafutbol.controller;

import com.github.csegu.porrafutbol.dto.UserDto;
import com.github.csegu.porrafutbol.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UserController {
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDto>> getAll() {
         return ResponseEntity.ok(userService.listUsers());
    }
}
