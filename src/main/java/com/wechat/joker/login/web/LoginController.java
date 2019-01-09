package com.wechat.joker.login.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author joker
 * @date 2019/1/8 15:19
 */
@RestController
@RequestMapping(path = "/joker")
public class LoginController {
    Logger logger= LoggerFactory.getLogger(LoginController.class);

    private String serverName;

    @GetMapping(path = "/getservername")
    public String getServerName(){
        return "";
    }

}
