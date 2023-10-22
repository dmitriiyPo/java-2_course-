package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IOneRealArgumentFunctionTest {
    @Test
    void getValueTest() {
        SinF S0 = new SinF(0, 1, 7, -1);
        SinF S1 = new SinF(3, 3, 7, 1);
        LinearF L0 = new LinearF(0, -6, 9, 1);
        LinearF L1 = new LinearF(9, 3, 9, 1);
        ExpF E0 = new ExpF(0, -6, 9, 1);
        ExpF E1 = new ExpF(3, -6, 9, 1);
        RacF R0 = new RacF(0, 6, 0, 1, 9, 1);
        RacF R1 = new RacF(6, -6, 1, 1, 9, 1);
        assertEquals(0, S0.getValue(3));
        assertEquals(3 * Math.sin(9), S1.getValue(3));
        assertEquals(-6, L0.getValue(3));
        assertEquals(30, L1.getValue(3));
        assertEquals(-6, E0.getValue(3));
        assertEquals(3 * Math.exp(3) - 6, E1.getValue(3));
        assertEquals(6, R0.getValue(3));
        assertEquals(3, R1.getValue(3));
    }
    @Test
    void getRightTest() {
        SinF S0 = new SinF(0, 1, -1, 1);
        SinF S1 = new SinF(3, 3, -1, 1);
        LinearF L0 = new LinearF(0, -6, 9, 56);
        LinearF L1 = new LinearF(9, 3, 9, 56);
        ExpF E0 = new ExpF(0, -6, 9, 56);
        ExpF E1 = new ExpF(3, -6, 9, 56);
        RacF R0 = new RacF(0, 6, 0, 1, 0, 5);
        RacF R1 = new RacF(6, 6, 1, 1, 0, 5);
        assertEquals(1, S0.getRight());
        assertEquals(1, S1.getRight());
        assertEquals(56, L0.getRight());
        assertEquals(56, L1.getRight());
        assertEquals(56, E0.getRight());
        assertEquals(56, E1.getRight());
        assertEquals(5, R0.getRight());
        assertEquals(5, R1.getRight());
    }
    @Test
    void getLeftTest() {
        SinF S0 = new SinF(0, 1, -1, 1);
        SinF S1 = new SinF(3, 3, -1, 1);
        LinearF L0 = new LinearF(0, -6, 9, 56);
        LinearF L1 = new LinearF(9, 3, 9, 56);
        ExpF E0 = new ExpF(0, -6, 9, 56);
        ExpF E1 = new ExpF(3, -6, 9, 56);
        RacF R0 = new RacF(0, 6, 0, 1, 0, 5);
        RacF R1 = new RacF(6, 6, 1, 1, 0, 5);
        assertEquals(-1, S0.getLeft());
        assertEquals(-1, S1.getLeft());
        assertEquals(9, L0.getLeft());
        assertEquals(9, L1.getLeft());
        assertEquals(9, E0.getLeft());
        assertEquals(9, E1.getLeft());
        assertEquals(0, R0.getLeft());
        assertEquals(0, R1.getLeft());
    }
}