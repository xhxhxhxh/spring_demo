package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @Controller
@RequestMapping("/users")
// @ResponseBody
@RestController // @Controller@ResponseBody
public class UsersController {
    @GetMapping
    public String getAll() {
        System.out.println("getAll user");
        return "{'info': '123'}";
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
