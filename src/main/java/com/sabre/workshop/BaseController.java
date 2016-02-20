package com.sabre.workshop;

/**
 * Created by Marcin on 2016-02-20.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hellow World!";
    }

}
