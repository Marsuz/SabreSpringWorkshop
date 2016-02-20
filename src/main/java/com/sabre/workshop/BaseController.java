package com.sabre.workshop;

/**
 * Created by Marcin on 2016-02-20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class BaseController {

    @Autowired
    private ComposableBean composableBean;

    @Autowired
    private CounterBean counterBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    @Resource(name = "inMemoryRepo")
    //@Resource(name = "notImplementedRepo")
    private Repo repo;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        String message = "Hello World! <br/>";
        message += "Current count: " + counterBean.incrementAndGet() + "<br/>";
        message += "Composable Bean: <br/>";
        message += "Repo: " + repo.toString() + "<br/>";
        message += "BaseController prototypeBean: " + prototypeBean.toString() + "<br/>";
        message += "ComposableBean prototypeBea: " + composableBean.getPrototypeBeanInfo() + "<br/>";
        return message;
    }

}
