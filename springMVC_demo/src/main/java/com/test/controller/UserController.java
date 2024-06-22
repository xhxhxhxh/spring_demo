package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/save")
  @ResponseBody
  public String save(String name) {
    System.out.println("save user" + name);
    return "{'info': '123'}";
  }

  // 不同名映射
  @RequestMapping("/getUsername")
  @ResponseBody
  public String getUsername(@RequestParam("name") String username) {
    System.out.println("save user" + username);
    return "{'info': '123'}";
  }

  // 处理list类型
  @RequestMapping("/testList")
  @ResponseBody
  public String testList(@RequestParam List<String> likes) {
    System.out.println(likes.toString());
    return "{'info': '123'}";
  }

  // 处理list类型
  @RequestMapping("/testJson")
  @ResponseBody
  public String testJson(@RequestBody List<String> likes) {
    System.out.println(likes.toString());
    return "{'info': '123'}";
  }

  // 直接跳转页面
  @RequestMapping("/jumpPage")
  public String jumpPage() {
    return "/index.jsp";
  }

  // 返回JSON
  @RequestMapping("/getPOJO")
  @ResponseBody
  public User getPOJO() {
    User user = new User();
    user.setAge(11);
    user.setName("威威");
    return user;
  }
}
