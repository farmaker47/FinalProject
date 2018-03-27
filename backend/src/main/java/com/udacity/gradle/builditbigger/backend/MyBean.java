package com.udacity.gradle.builditbigger.backend;

import com.george.javalibraryforjokes.jokesClass;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;
    private jokesClass jokesClass;

    public MyBean() {
    jokesClass = new jokesClass();
    }

    public String getData() {
        return jokesClass.randomJokesToPass();
    }

    public void setData(String data) {
        myData = data;
    }
}