package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductPackageTest {
    @Test
    void ProductPackageTest1() {  // тест конструктора
        ProductPackage a = new ProductPackage();
        assertEquals("Лажа", a.getName());
        assertEquals(1, a.getWeight());
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        assertEquals("Вещщщ", b.getName());
        assertEquals(1.25, b.getWeight());
    }

    @Test
    void testToString() {
        ProductPackage a = new ProductPackage();
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        assertEquals("Лажа(1,000000 кг)", a.toString());
        assertEquals("Вещщщ(1,250000 кг)", b.toString());
    }
    @Test
    void testEquals() {
        ProductPackage a = new ProductPackage();
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        ProductPackage c = new ProductPackage("Вещщщ", 1);
        ProductPackage d = new ProductPackage("Вещщщ", 1.25);
        ProductPackage e = new ProductPackage("Вещщ", 1.25);
        assertEquals(d, b);
        assertNotEquals(a, b);
        assertNotEquals(b, c);
        assertNotEquals(b, e);
    }
    @Test
    void testHashCode() {
        ProductPackage a = new ProductPackage();
        ProductPackage b = new ProductPackage("Вещщщ", 1.25);
        ProductPackage c = new ProductPackage("Вещщщ", 1);
        ProductPackage d = new ProductPackage("Вещщщ", 1.25);
        ProductPackage e = new ProductPackage("Вещщ", 1.25);
        assertEquals(d.hashCode(), b.hashCode());
        assertNotEquals(a.hashCode(), b.hashCode());
        assertNotEquals(b.hashCode(), c.hashCode());
        assertNotEquals(b.hashCode(), e.hashCode());
    }
}