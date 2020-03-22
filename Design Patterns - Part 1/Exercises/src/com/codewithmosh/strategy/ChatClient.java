package com.codewithmosh.strategy;

public class ChatClient {
    private IEncrypt encryptionAlgorithm;

    public ChatClient(IEncrypt encryptionAlgorithm) {

        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        try {
            encryptionAlgorithm.Encrypt(message);
        }catch (Exception e){
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }

        System.out.println("Sending the encrypted message...");
    }
}
