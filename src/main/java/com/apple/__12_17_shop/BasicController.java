package com.apple.__12_17_shop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "안녕하세요.";
    }

}
