package com.example.demo;

public class Injection {
    public static ZXingBridge provideZXingBridge() {
        return new ZXingBridge();
    }
}
