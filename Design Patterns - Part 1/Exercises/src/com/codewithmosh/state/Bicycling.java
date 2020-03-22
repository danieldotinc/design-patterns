package com.codewithmosh.state;

public class Bicycling implements ITravel {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
