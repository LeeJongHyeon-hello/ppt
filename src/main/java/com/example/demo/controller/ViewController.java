package com.example.demo.controller;

import com.example.demo.dto.oauth2.SessionUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ViewController {

    private final HttpSession httpSession;

    public ViewController(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/oauth")
    public String index(Model model){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user != null){
            model.addAttribute("email", user.getEmail());
            model.addAttribute("username",user.getName());
            model.addAttribute("userImg", user.getPicture());
        }
        return "/home";
    }
}
