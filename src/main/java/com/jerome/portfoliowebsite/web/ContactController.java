package com.jerome.portfoliowebsite.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping()
    public String getContact() {
        System.out.println("RETURNING CONTACT PAGE");
        return "contact-me";
    }

}
