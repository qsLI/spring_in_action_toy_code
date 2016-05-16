package com.springinaction.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KL on 2016/5/15.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }
}
