package com.codewithmosh.strategy;

public class DESEncrypt implements IEncrypt {
    @Override
    public String Encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return message;
    }
}
