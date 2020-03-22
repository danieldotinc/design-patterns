package com.codewithmosh.state;

public class Driving implements ITravel {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
