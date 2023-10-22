package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FunctionalTest {
    @Test
    void calculateSum() {
        SinF S0 = new SinF(0, 1, 7, -1);
        SinF S1 = new SinF(3, 1, 9, 1);
        LinearF L0 = new LinearF(0, -6, 9, 1);
        LinearF L1 = new LinearF(9, 3, 9, 1);
        ExpF E0 = new ExpF(0, -6, 9, 1);
        ExpF E1 = new ExpF(3, -6, 9, 1);
        RacF R0 = new RacF(0, 6, 0, 1, 9, 1);
        RacF R1 = new RacF(6, -6, 1, 3, 9, 1);
        Sum<IOneRealArgumentFunction> Sum = new Sum<>();
        assertEquals(0, Sum.calculate(S0));
        assertEquals(3 * Math.sin(9) + 3 * Math.sin(1) + 3 * Math.sin(5), Sum.calculate(S1));
        assertEquals(-18, Sum.calculate(L0));
        assertEquals(144, Sum.calculate(L1));
        assertEquals(-18, Sum.calculate(E0));
        assertEquals(3 * Math.exp(1) - 6 + 3 * Math.exp(9) - 6 + 3 * Math.exp(5) - 6, Sum.calculate(E1));
        assertEquals(18, Sum.calculate(R0));
        assertEquals(7, Sum.calculate(R1));
    }
    @Test
    void calculateI() {
        SinF S0 = new SinF(0, 1, 10, 0);
        SinF S1 = new SinF(3, 1, 10, 0);
        SinF S2 = new SinF(1, 1, 10, -10);
        LinearF L0 = new LinearF(0, -6, 10, 0);
        LinearF L1 = new LinearF(9, 3, 10, 0);
        ExpF E0 = new ExpF(0, -6, 10, 0);
        ExpF E1 = new ExpF(3, -6, 10, 0);
        RacF R0 = new RacF(0, 6, 0, 1, 10, 0);
        RacF R1 = new RacF(6, -6, 1, 3, 10, 0);

        Integral<IOneRealArgumentFunction> I = new Integral<>(2, 8);
        Integral<IOneRealArgumentFunction> I2 = new Integral<>( 3.14, 6.28);

        assertEquals(-36, I.calculate(L0), 1);
        assertEquals(288, I.calculate(L1), 1);
        assertEquals(0, I.calculate(S0), 1);
        assertEquals(-36, I.calculate(E0), 1);
        assertEquals(3 * Math.exp(8) - 48 - 3 * Math.exp(2) + 12, I.calculate(E1), 2);
        assertEquals(36, I.calculate(R0), 1);
        assertEquals(17, I.calculate(R1), 1);
        assertEquals(-2, I2.calculate(S2), 0.001);
    }
}