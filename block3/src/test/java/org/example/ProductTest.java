package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductTest {
    @Test
    void ProductTest1() { // тест конструктора
        Product a = new Product();
        Product b = new Product("Собачьи говняшки", "Элитный сорт");
        assertEquals("Хлам", a.getName());
        assertEquals("Непонятно", a.getDescription());
        assertEquals("Собачьи говняшки", b.getName());
        assertEquals("Элитный сорт", b.getDescription());
    }
    @Test
    void testToString() {
        Product a = new Product();
        Product b = new Product("Трава", "Высший сорт");
        assertEquals("Хлам: Непонятно", a.toString());
        assertEquals("Трава: Высший сорт", b.toString());
    }
    @Test
    void testEquals() {
        Product a = new Product();
        Product b = new Product("Трава", "Высший сорт");
        Product c = new Product("Трава", "Высший сорт");
        Product d = new Product("Трава", "Элитный сорт");
        Product e = new Product("Лажа", "Высший сорт");
        assertEquals(b, c);
        assertNotEquals(a, b);
        assertNotEquals(d, b);
        assertNotEquals(e, b);
    }
    @Test
    void testHashCode() {
        Product a = new Product();
        Product b = new Product("Трава", "Высший сорт");
        Product c = new Product("Трава", "Высший сорт");
        Product d = new Product("Трава", "Элитный сорт");
        Product e = new Product("Лажа", "Высший сорт");
        assertEquals(b.hashCode(), c.hashCode());
        assertNotEquals(a.hashCode(), b.hashCode());
        assertNotEquals(d.hashCode(), b.hashCode());
        assertNotEquals(e.hashCode(), b.hashCode());
    }
}