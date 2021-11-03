package handler.springframework.springrecipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Evan on 4/9/2021
 */
@Controller
public class IndexController {
    @RequestMapping({"/", "/index", ""})
            public String getIndexPage(){
            System.out.println("evn");
            return"index";
    }
}
