package com.bacc.designpatterns.state;

public class SelectionIcon implements Tool{

    @Override
    public void mouseUp() {
        System.out.printf("Selection Icon \n");
    }

    @Override
    public void mouseDown() {
        System.out.printf("Selecting ... \n");
    }
}
