package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSizeTest {

    LineSize size = new LineSize(5);

    @Test
    public void testApplyOK() {
        assertTrue(size.apply("Араба"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(size.apply("аРека течет"));
        assertFalse(size.apply("Бублик"));
    }


}