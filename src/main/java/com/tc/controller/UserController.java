package com.tc.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tc.entity.User;
import com.tc.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tc
 * @since 2020-06-11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("测试")
    @GetMapping("test")
	public List test(){
        List<User> users = userService.selectList(new EntityWrapper<>());
        return users;
    }
}
