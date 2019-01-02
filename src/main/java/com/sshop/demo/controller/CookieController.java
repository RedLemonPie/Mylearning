package com.sshop.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class CookieController {
    @RequestMapping("/cookie")
    public Map<String, Object> cookie(@RequestParam("browser") String browser, HttpServletRequest request, HttpSession session) {
        //取出session中的browser
        Object sessionBrowser = session.getAttribute("browser");
        Map<String, Object> map = new HashMap<String,Object>();
        if (sessionBrowser == null) {
            System.out.println("不存在session，设置browser=" + browser)   ;
            session.setAttribute("browser", browser);
            map.put("browser", browser);
        } else {
            System.out.println("存在session，browser=" + sessionBrowser.toString());
        }
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + " : " + cookie.getValue());
                map.put("cookiename", cookie.getName());
                map.put("cookievalues", cookie.getValue());
            }
        }
        return map;
    }
}
