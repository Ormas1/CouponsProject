package com.or.couponsPhaseTwo.controllers;

import com.or.couponsPhaseTwo.dtos.User;
import com.or.couponsPhaseTwo.logic.UsersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersLogic usersLogic;

    @PostMapping
    public long createUser(@RequestBody User user) {
        long id = usersLogic.createUser(user);
        return id;
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        usersLogic.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        usersLogic.deleteUser(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return usersLogic.getAllUsers();
    }
}

