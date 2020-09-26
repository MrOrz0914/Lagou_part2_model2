package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public void login(String username, String password, HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (username.equals("admin") && password.equals("admin")) {
            request.getSession().setAttribute("hasAuth", true);
            response.sendRedirect(request.getContextPath() + "/resume/queryAll");
        } else {
            response.sendRedirect(request.getContextPath() + "/403.jsp");
        }
    }
}
