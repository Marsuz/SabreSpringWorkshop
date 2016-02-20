package com.sabre.workshop;

/**
 * Created by Marcin on 2016-02-20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@ComponentScan(value = "com.sabre.workshop")
public class BaseController {

    @Autowired
    private ComposableBean composableBean;

    @Autowired
    private CounterBean counter;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        String message = "Hello World! ";
        message += "Current count: " + counter.incrementAndGet() + " ";
        message += "Composable Bean: ";
        return message;
    }

}
