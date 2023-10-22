package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {

    BeginStringFilter filter = new BeginStringFilter("мама");

    @Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "мама");
    }

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Мама мыла раму"));
        assertFalse(filter.apply("папа мыл раму"));
    }
}