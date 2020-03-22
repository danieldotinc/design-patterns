package com.codewithmosh.template;

public class VSCodeWin extends Window {
    @Override
    protected void execBeforeClose() {
        System.out.println("exec tasks before closing vs code ...");
    }

    @Override
    protected void execAfterClose() {
        System.out.println("exec tasks after closing vs code ...");
    }
}
