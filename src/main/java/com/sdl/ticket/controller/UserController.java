package com.sdl.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:
 * Author: sdl
 * Date: 2020-02-15-9:55 下午
 */
@Controller
public class UserController {
    @GetMapping("hello")
    public String helloworld(){
        return "hello";
    }
}
