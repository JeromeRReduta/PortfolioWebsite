package com.jerome.portfoliowebsite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* Controller in charge of the contact-me page */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping()
    public String getContact() {
        System.out.println("RETURNING CONTACT PAGE");
        return "contact-me";
    }

}
