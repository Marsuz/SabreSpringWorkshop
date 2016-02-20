package com.sabre.workshop;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Marcin on 2016-02-20.
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    private final UUID uid;

    public PrototypeBean() {
        this.uid = UUID.randomUUID();
    }

    public String toString() {
        return super.toString() + " " + uid;
    }

}
