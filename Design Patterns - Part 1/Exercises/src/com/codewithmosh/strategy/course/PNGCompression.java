package com.codewithmosh.strategy.course;

public class PNGCompression implements ICompressor {
    @Override
    public String compress(String file) {
        System.out.println("Applying PNG Compression ...");
        return file;
    }
}
