package org.code.with.chief.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternationalizationController {

	@GetMapping("/international")
    public String getInternationalPage() {
        return "thymeleaf/international";
    }
}
