package com.codewithmosh.chainOfResponsibility;

public class DataReader {
    private Reader firstReader;

    public DataReader(Reader firstReader) {
        this.firstReader = firstReader;
    }

    public void read(String fileName) {
        firstReader.read(fileName);
    }
}
