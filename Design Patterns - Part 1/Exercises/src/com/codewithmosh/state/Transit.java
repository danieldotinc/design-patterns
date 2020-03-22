package com.codewithmosh.state;

public class Transit implements ITravel {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
