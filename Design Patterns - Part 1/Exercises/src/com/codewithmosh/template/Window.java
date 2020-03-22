package com.codewithmosh.template;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.

        execBeforeClose();

        System.out.println("Removing the window from the screen");

        execAfterClose();

        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }

    protected abstract void execBeforeClose();
    protected abstract void execAfterClose();
}
