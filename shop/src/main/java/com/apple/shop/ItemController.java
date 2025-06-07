package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
    @GetMapping("/list")
    String list(Model model){
        model.addAttribute("name", "기운이 넘친다 기운줄게");
        return "list.html";
    }
}
