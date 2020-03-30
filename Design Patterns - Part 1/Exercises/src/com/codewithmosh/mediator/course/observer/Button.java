package com.codewithmosh.mediator.course.observer;

public class Button extends UIControl {
    private boolean isEnabled;

    public void clicked(){
        notifyEventHandlers();
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
