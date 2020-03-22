package com.codewithmosh.strategy.course;

public class HighContrastFilter implements IFilter {
    @Override
    public String apply(String file) {
        System.out.println("Applying High Contrast Filter ...");
        return file;
    }
}
