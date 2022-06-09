package dev.dawoon.controller;

import dev.dawoon.domain.User;
import dev.dawoon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(method = RequestMethod.POST, value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    @PostMapping(value = "/list")
    public Iterable<User> list() {
        return userService.list();
    }

}
