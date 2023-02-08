package org.newportal.service;

public class MethodOverload {
    public int sum(int first, int second) {
        return first + second;
    }

    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public String sum(int first, int second, String message) {
        int result = first + second;
        return message + result;
    }
}
