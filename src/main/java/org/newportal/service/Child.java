package org.newportal.service;

public class Child extends Override {
    @java.lang.Override
    public String printHello() {
        return "Hello!";
    }

    public String printWorld() {
        return printHello() + " World!";
    }


}
