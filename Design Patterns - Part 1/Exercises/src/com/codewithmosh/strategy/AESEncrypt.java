package com.codewithmosh.strategy;

public class AESEncrypt implements IEncrypt {
    @Override
    public String Encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return message;
    }
}
