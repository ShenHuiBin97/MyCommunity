package com.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ShenHuiBin
 * @Date: 2019/11/9 16:24
 * @Version 1.0
 * @Demand:
 */
@Controller
public class HelloWord {
    @GetMapping("/hello")
    public String greeting(@RequestParam(value="name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
