package com.codewithmosh.chainOfResponsibility;

public abstract class Reader {
    private Reader reader;
    public Reader(Reader reader){
        this.reader = reader;
    }

    void read(String fileName){
        if (doRead(fileName))
            return;

        if (reader != null) reader.read(fileName);
    }

    abstract boolean doRead(String fileName);
}
