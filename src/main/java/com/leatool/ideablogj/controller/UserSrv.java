package com.leatool.ideablogj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户模块功能接口
 */
@Controller
@RequestMapping("/")
public class UserSrv {

    /**
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getLogin(){
        return "home";
    }

}
