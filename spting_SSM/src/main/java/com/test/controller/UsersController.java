package com.test.controller;

import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController // @Controller@ResponseBody
public class UsersController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Result<List<User>> getAll() {
        List<User> users = userService.checkAll();
        return new Result<>(Codes.GET_OK, users);
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        System.out.println("getById user" + id);
        return "{'info': '123'}";
    }

    @PostMapping
    public String save() {
        System.out.println("save user");
        return "{'info': '123'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("delete user" + id);
        return "{'info': '123'}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("update user" + user);
        return "{'info': '123'}";
    }
}
