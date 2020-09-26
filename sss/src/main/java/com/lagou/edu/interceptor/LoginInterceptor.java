package com.lagou.edu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler) throws Exception {
        Boolean hasAuth = (Boolean) request.getSession().getAttribute("hasAuth");
        System.out.println(hasAuth);
        if (hasAuth != null && hasAuth == true) {
            return hasAuth;
        } else {
            response.sendRedirect(request.getContextPath()  + "/login.jsp");
            return false;
        }
    }
}
