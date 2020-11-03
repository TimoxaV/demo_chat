package com.webchat.bootchat.controllers;

import com.webchat.bootchat.service.UserCounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppController {
    @GetMapping("/")
    public String index(HttpServletRequest request, Model model) {
        String username = (String) request.getSession().getAttribute("username");
        if (username == null || username.isEmpty()) {
            return "redirect:/login";
        }
        model.addAttribute("username", username);
        return "chat";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(HttpServletRequest request, @RequestParam String username) {
        if (UserCounterService.getActiveUsers() > 1) {
            return "maxUsersConnected";
        }
        username = username.trim();
        if (username.isEmpty()) {
            return "login";
        }
        request.getSession().setAttribute("username", username);
        UserCounterService.addUser();
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        UserCounterService.removeUser();
        return "redirect:/login";
    }
}
