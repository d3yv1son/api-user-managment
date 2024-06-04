package com.fametro.usermanagement.Controller;

import com.fametro.usermanagement.Controller.dto.UserCreationDto;
import com.fametro.usermanagement.Controller.dto.UserDto;
import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.service.UserService;
import com.fametro.usermanagement.service.exception.UserNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class  UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        List<User> users = userService.findAll();
        return users.stream()
                .map(UserDto::fromEntity)
                .toList();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id) throws UserNotFoundExeption {
        return UserDto.fromEntity( userService.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserCreationDto userCreationDto) {
        return UserDto.fromEntity(
                userService.create(userCreationDto.toEntity())
        );
    }
}
