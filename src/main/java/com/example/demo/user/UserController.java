package com.example.demo.user;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("list")
    @ResponseBody
    public String getUserName(User user) {
        if (user.getId() != null) { // 判断参数完整性

            try {
                int id = Integer.parseInt(user.getId()); // 参数类型校验
                return userService.getUserName(id);
            } catch (NumberFormatException e) {
                return "ID需要是数值类型";
            }
        }

        return "必须传递ID";
    }

}
