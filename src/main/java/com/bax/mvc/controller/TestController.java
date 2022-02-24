package com.bax.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bax Email:baxdd55@outlook.com
 * @Description
 * @date 2022/2/17 14:53
 */
@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
    public String Test(){
        return "test";
    }
}

