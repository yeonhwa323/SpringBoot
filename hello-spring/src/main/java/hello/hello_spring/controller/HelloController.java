package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.model.IAttribute;

@Controller
public class HelloController {
    @GetMapping
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
