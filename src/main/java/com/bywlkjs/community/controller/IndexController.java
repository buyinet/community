package com.bywlkjs.community.controller;

import com.bywlkjs.community.Mapper.UserMapper;
import com.bywlkjs.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/")
    public String greeting(HttpServletRequest request, HttpSession session){
        Cookie[] cookies=request.getCookies();
        for (Cookie cookie : cookies){
            if ("token".equals(cookie.getName())){
                String token=cookie.getValue();
                User user=userMapper.findByToken(token);

                if(user!=null)
                    session.setAttribute("user", user);

                break;
            }
        }
        return "index";
    }

}
