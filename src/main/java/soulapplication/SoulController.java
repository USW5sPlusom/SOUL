package soulapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SoulController {
    @GetMapping
    public String home(){
        return "home";
    }
}
