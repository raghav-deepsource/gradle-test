package com.example.subMultiModule2;

import java.util.Random;

public class LibModClass {
    public String sayHello() {
        String a = null;
        if (new Random().nextBoolean()) a = "true";
        return a;
    }

    public int compute(int a, int b) {
        return a + b;
    }
}
