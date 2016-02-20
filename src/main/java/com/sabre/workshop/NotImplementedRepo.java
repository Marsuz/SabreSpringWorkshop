package com.sabre.workshop;

/**
 * Created by Marcin on 2016-02-20.
 */
public class NotImplementedRepo implements Repo{

    public void store(String name) {}

    public String get(Long id) { return "not found"; }

    public String toString() {
        return "No repo";
    }
}
