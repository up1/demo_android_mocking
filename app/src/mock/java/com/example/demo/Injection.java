package com.example.demo;

import org.mockito.Mockito;

public class Injection {
    private static ZXingBridge bridge = null;
    public static ZXingBridge provideZXingBridge() {
        if (bridge == null) {
            bridge = Mockito.mock(ZXingBridge.class);
        }
        return bridge;
    }
}