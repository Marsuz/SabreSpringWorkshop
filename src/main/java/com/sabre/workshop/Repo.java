package com.sabre.workshop;

/**
 * Created by Marcin on 2016-02-20.
 */
public interface Repo {

    public String get(Long id);

    public void store(String passenger);

    public String toString();
}
