package com.codewithmosh.mediator.course;

public abstract class UIControl {
    protected DialogBox owner;
    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
