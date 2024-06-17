package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/{doctor}")
    @ResponseBody
    public String index(@PathVariable("doctor") int docotorId) {
        switch (docotorId) {
            case 1:
                return "William Hartnell";
            case 10:
                return "David Tennant";
            case 13:
                return "Jodie Whittaker";
            default:
                return "Pas de donnée";
        }
    }
}
