package com.example.subModule;

import org.junit.jupiter.api.Test;

class SubMainTest {

    @Test
    void doTHing() {
        SubMain sm = new SubMain();

        assertNotEquals("", sm.doTHing());
    }

}
