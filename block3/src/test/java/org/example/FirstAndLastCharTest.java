package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastCharTest {

    FirstAndLastChar filter2 = new FirstAndLastChar('А','б');


    @Test
    public void testApplyOK() {
        assertTrue(filter2.apply("Араб"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter2.apply("аРека течет"));
        assertFalse(filter2.apply("Бублик"));
    }





}