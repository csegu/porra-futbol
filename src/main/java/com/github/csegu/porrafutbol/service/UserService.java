package com.github.csegu.porrafutbol.service;

import com.github.csegu.porrafutbol.dto.UserDto;
import com.github.csegu.porrafutbol.model.User;
import com.github.csegu.porrafutbol.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__({
    @Autowired}))
public class UserService {

    private UserRepository userRepository;

    @Transactional
    public void addUser(UserDto userDto) {
        User user = new User(userDto.getUserId(), userDto.getUserName(), userDto.getUserBets(), userDto.getUserPoints());
        userRepository.save(user);
    }

    public List<UserDto> listUsers() {
        return userRepository.findAll().stream().map(UserService::map).collect(Collectors.toList());
    }

    public UserDto findById(Long id) {
        return UserService.map(userRepository.getOne(id));
    }

    public static UserDto map(User user) {
        UserDto result = null;
        if (user != null) {
            result = new UserDto(user.getUserId(), user.getUserName(), user.getUserBets(), user.getUserPoints());
        }
        return result;
    }
}
