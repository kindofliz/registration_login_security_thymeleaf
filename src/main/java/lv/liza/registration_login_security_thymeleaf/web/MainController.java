package lv.liza.registration_login_security_thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //homepage method handler
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("firstName", "Liza");
        return "index";
    }


}
