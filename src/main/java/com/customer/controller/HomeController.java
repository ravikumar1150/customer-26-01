package com.customer.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";  // This corresponds to /WEB-INF/views/home.jsp
    }
System.out.print("contrller")
}

