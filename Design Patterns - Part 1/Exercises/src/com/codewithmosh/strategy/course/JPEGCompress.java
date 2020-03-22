package com.codewithmosh.strategy.course;

public class JPEGCompress implements ICompressor{
    @Override
    public String compress(String file) {
        System.out.println("Applying JPEG Compression ...");
        return file;
    }
}
