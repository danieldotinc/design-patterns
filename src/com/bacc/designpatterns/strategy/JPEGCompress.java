package com.bacc.designpatterns.strategy;

public class JPEGCompress implements ICompressor{
    @Override
    public String compress(String file) {
        System.out.println("Applying JPEG Compression ...");
        return file;
    }
}
