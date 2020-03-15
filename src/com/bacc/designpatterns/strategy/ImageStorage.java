package com.bacc.designpatterns.strategy;

public class ImageStorage {

    public void store(String fileName,ICompressor compressor, IFilter filter){
        System.out.println("Start storing the " + fileName + " ...");
        compressor.compress(fileName);
        filter.apply(fileName);
    }

}
