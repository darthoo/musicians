package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by eugen on 3/24/17.
 */
@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String getHelloPage() {
         return "musicIndex";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getHelloString() {
        return "musicIndex.jsp";
    }
}
