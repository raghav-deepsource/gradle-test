package com.example.subModule;

import com.example.subMultiModule2.LibModClass;

public class SubMain {
    public String doTHing() {
        LibModClass a;
        a = new LibModClass();

        return a.sayHello();
    }
}
