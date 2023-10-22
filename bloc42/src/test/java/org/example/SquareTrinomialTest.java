package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTrinomialTest
{
    @Test
    void solution()
    {
        SquareTrinomial a = new SquareTrinomial(1, -4, 4);
        SquareTrinomial b = new SquareTrinomial(1, -6, 5);
        SquareTrinomial c = new SquareTrinomial(0, -6, 3);
        assertArrayEquals(new double[]{ 2 }, a.Solution());
        assertArrayEquals(new double[]{ 1, 5 }, b.Solution());
        assertArrayEquals(new double[]{ 0.5 }, c.Solution());

    }
}