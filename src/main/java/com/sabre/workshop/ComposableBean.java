package com.sabre.workshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Marcin on 2016-02-20.
 */

@Component
public class ComposableBean implements InitializingBean, DisposableBean{

    @Autowired
    private CounterBean counterBean;

    final static Logger logger = LoggerFactory.getLogger(CounterBean.class);


    @Override
    public void destroy() throws Exception {
        logger.info("Shutting Down ComposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(counterBean, "counter bean not null");
        logger.info("Initializing ComposableBean!");
    }
}
