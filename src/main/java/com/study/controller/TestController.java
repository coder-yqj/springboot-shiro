package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangqj on 2017/4/19.
 */
@Controller
public class TestController {

    @RequestMapping("/helloHtml")
    public String helloHtml(Model model){
        model.addAttribute("msg","helloWorld");
        return"/helloHtml";
    }
}
