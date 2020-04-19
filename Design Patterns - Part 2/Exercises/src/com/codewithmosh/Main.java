package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        //execCompositePattern();
        //execDecoratorPattern();
        execFacadePattern();
    }

    private static void execFacadePattern() {
    com.codewithmosh.facade.Demo.show();
    }

    private static void execDecoratorPattern() {
        com.codewithmosh.decorator.Demo.show();
    }

    private static void execCompositePattern() {
        com.codewithmosh.composite.Demo.show();
    }
}
