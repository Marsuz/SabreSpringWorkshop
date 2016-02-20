package com.sabre.workshop;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Marcin on 2016-02-20.
 */

@Component
public class CounterBean implements InitializingBean {

    private final AtomicInteger counter = new AtomicInteger(0);

    public Integer incrementAndGet() {
        return counter.incrementAndGet();
    }

    public Integer get() {
        return counter.get();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(counter.get());
    }
}
