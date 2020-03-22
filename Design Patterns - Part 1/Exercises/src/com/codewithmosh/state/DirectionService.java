package com.codewithmosh.state;

public class DirectionService {
    private ITravel travel;
    public DirectionService(ITravel travel){
        this.travel = travel;
    }

    public Object getEta() {
        return travel.getETA();
    }

    public Object getDirection() {
        return travel.getDirection();
    }

}
