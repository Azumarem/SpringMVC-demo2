package com.bax.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author bax Email:baxdd55@outlook.com
 * @Description
 * @date 2022/2/17 15:39
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST},
            params = {"username!=admin"}
    )
    public String success(){
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username"},
            headers = {"Host=localhost:8081 "}
    )
    public String testParamsAndHeaders(){
        return "success";
    }

}
