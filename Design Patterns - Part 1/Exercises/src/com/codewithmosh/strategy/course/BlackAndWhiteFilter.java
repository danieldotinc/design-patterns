package com.codewithmosh.strategy.course;

public class BlackAndWhiteFilter implements IFilter {
    @Override
    public String apply(String file) {
        System.out.println("Applying Black And White Filter ...");
        return file;
    }
}
