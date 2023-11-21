package com.example.test.service;
import com.example.test.model.Message;

public class AtreidesDecoder implements Decoder {
    @Override
    public String decode(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            result += (char) (message.charAt(i) + 3);
        }
        return result;
    }
}
