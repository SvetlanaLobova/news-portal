package org.newportal.service;

import java.util.Objects;

public class Override {
    private String property;
    public String printHello() {
        return "old version";
    }

    public String printWorld() {
        return "World!";
    }
}
