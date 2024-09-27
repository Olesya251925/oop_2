package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void testEqualWeights() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(10);
        assertEquals("=", balance.result());
    }

    @Test
    void testLeftHeavier() {
        Balance balance = new Balance();
        balance.addLeft(15.5);
        balance.addRight(10);
        assertEquals("L", balance.result());
    }

    @Test
    void testRightHeavier() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(15);
        assertEquals("R", balance.result());
    }
}
