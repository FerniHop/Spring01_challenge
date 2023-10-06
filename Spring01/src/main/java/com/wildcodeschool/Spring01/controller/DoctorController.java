package com.wildcodeschool.Spring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell";
    }

    @GetMapping("/10")
    @ResponseBody
    public String doctor10() {
        return "David Tennant";
    }

    @GetMapping("/13")
    @ResponseBody
    public String doctor13() {
        return "Jodie Whittaker";
    }
}
