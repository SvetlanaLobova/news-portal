package org.newportal.service.access;

public class Vehicle {
    public static String pub = "pub";
    static String defaul = "defaul";
    protected static String protec = "protec";
    private String priv = "priv";
    static String str;

    {
        str = "str";
    }

    static class Boat {
        Vehicle vehicle = new Vehicle();
        public String pro = vehicle.priv + " hello";
    }

    public static void main(String[] args) {
        Boat boat = new Boat();
        System.out.println(boat.pro);
    }
}
