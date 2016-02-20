package com.sabre.workshop;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by Marcin on 2016-02-20.
 */

@Component
public class InMemoryRepo implements Repo{

    private HashMap<Long, String> passengers = new HashMap<Long, String>();
    private long currentId = 1;

    public void store(String name) {
        passengers.put(currentId++, name);
    }

    public String get(Long id) {
        return passengers.get(id);
    }

    public String toString() {
        return passengers.toString();
    }

}
