package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }

    @RequestMapping(value= "/info")
    public String info(){
        return "info";
    }
}
