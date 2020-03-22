package com.codewithmosh.state.course;

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
