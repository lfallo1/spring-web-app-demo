package com.springdemo.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String mainGET(HttpSession session) {
    	//maps to WEB-INF/app/views/home.jsp due to mvc-config.xml configuration
        return "home";
    }
}
