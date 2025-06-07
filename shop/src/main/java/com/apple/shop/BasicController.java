package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }
    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "이지훈입니다.";
    }
    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "마이페이지입니다.";
    }

    @GetMapping("/time")
    @ResponseBody
    String currentTime(){
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
