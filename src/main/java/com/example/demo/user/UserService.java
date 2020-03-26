package com.example.demo.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUserName(int id) {
        if (id % 2 == 1) {
            String realId = id + ""; // 处理参数
            User user = userDao.getUserName(realId);
            return user.getRealname(); // 处理结果
        }

        return "不允许查看ID为偶数的记录";
    }

}
