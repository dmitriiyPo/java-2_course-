package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

public class LambdaDemoTest {
    @Test
    void lambda1() {
        assertEquals(5, LambdaRunner.LambdaF1(LambdaDemo.lambda1, "12345"));
        assertEquals(0, LambdaRunner.LambdaF1(LambdaDemo.lambda1, ""));
        assertEquals(2, LambdaRunner.LambdaF1(LambdaDemo.lambda1, "15"));
        assertEquals(7, LambdaRunner.LambdaF1(LambdaDemo.lambda1, "1234523"));
    }
    @Test
    void lambda2() {
        assertEquals('1', LambdaRunner.LambdaF1(LambdaDemo.lambda2, "12345"));
        assertEquals('3',LambdaRunner.LambdaF1(LambdaDemo.lambda2, "345"));
        assertNull(LambdaRunner.LambdaF1(LambdaDemo.lambda2, ""));
        assertNull(LambdaRunner.LambdaF1(LambdaDemo.lambda2, null));
    }
    @Test
    void lambda3() {
        assertTrue(LambdaRunner.LambdaF1(LambdaDemo.lambda3, "6544168"));
        assertFalse(LambdaRunner.LambdaF1(LambdaDemo.lambda3,"65441 68"));
    }
    @Test
    void lambda4() {
        assertEquals(3,LambdaRunner.LambdaF1(LambdaDemo.lambda4, "1,,,234, 5"));
        assertEquals(1, LambdaRunner.LambdaF1(LambdaDemo.lambda4, "345"));
    }
    @Test
    void lambda5() {
        Human human1 = new Human("Иванов", "Иван", "Иваныч", 5, 'M');
        Human human2 = new Human("Петров", "Иван", "Иваныч", 17, 'M');
        Student student1 = new Student("Петров", "Иван", "Иваныч", 17, 'M', "",
                "", "");
        assertEquals(5, LambdaRunner.LambdaF1(LambdaDemo.lambda5, human1));
        assertEquals(17, LambdaRunner.LambdaF1(LambdaDemo.lambda5, human2));
        assertEquals(17, LambdaRunner.LambdaF1(LambdaDemo.lambda5, student1));
    }
    @Test
    void lambda6() {
        Human human1 = new Human("Иванов", "Иван", "Иваныч", 5, 'M');
        Human human2 = new Human("Петров", "Иван", "Иваныч", 17, 'M');
        Human human3 = new Human("Петров", "Юрий", "Иваныч", 15, 'M');
        Student student1 = new Student("Петров", "Иван", "Иваныч", 17, 'M', "",
                "", "");
        assertFalse(LambdaRunner.LambdaF2(LambdaDemo.lambda6, human1, human2));
        assertTrue(LambdaRunner.LambdaF2(LambdaDemo.lambda6, human3, human2));
        assertFalse(LambdaRunner.LambdaF2(LambdaDemo.lambda6, human1, student1));
        assertTrue(LambdaRunner.LambdaF2(LambdaDemo.lambda6, human3, student1));
    }
    @Test
    void lambda7() {
        Human human1 = new Human("Иванов", "Иван", "Иваныч", 5, 'M');
        Human human2 = new Human("Петров", "Иван", "Иваныч", 17, 'M');
        Student student1 = new Student("Петров", "Иван", "Иваныч", 17, 'M', "",
                "", "");
        assertEquals("Иванов Иван Иваныч", LambdaRunner.LambdaF1(LambdaDemo.lambda7, human1));
        assertEquals("Петров Иван Иваныч", LambdaRunner.LambdaF1(LambdaDemo.lambda7, human2));
        assertEquals("Петров Иван Иваныч", LambdaRunner.LambdaF1(LambdaDemo.lambda7, student1));
    }
    @Test
    void lambda8() {
        Human human1 = new Human("Иванов", "Иван", "Иваныч", 5, 'M');
        Human human2 = new Human("Петров", "Иван", "Иваныч", 17, 'M');
        Student student1 = new Student("Петров", "Иван", "Иваныч", 17, 'M', "",
                "", "");
        assertEquals(new Human("Иванов", "Иван", "Иваныч", 6, 'M'),
                LambdaRunner.LambdaF1(LambdaDemo.lambda8, human1));
        assertEquals(new Human("Петров", "Иван", "Иваныч", 18, 'M'),
                LambdaRunner.LambdaF1(LambdaDemo.lambda8, human2));
        assertEquals(new Human("Петров", "Иван", "Иваныч", 18, 'M'),
                LambdaRunner.LambdaF1(LambdaDemo.lambda8, student1));
    }
    @Test
    void lambda9() {
        Human human1 = new Human("Иванов", "Иван", "Иваныч", 5, 'M');
        Human human2 = new Human("Петров", "Иван", "Иваныч", 17, 'M');
        Human human3 = new Human("Петров", "Юрий", "Иваныч", 15, 'M');
        Human human4 = new Human("Иванов", "Юрий", "Иваныч", 20, 'M');
        Student student1 = new Student("Петров", "Иван", "Иваныч", 17, 'M', "",
                "", "");
        assertFalse(LambdaRunner.LambdaF4(LambdaDemo.lambda9, human1, human2, human4, 18));
        assertTrue(LambdaRunner.LambdaF4(LambdaDemo.lambda9, human1, human2, human3, 18));
        assertFalse(LambdaRunner.LambdaF4(LambdaDemo.lambda9, human1, student1, human4, 18));
        assertTrue(LambdaRunner.LambdaF4(LambdaDemo.lambda9, human1, student1, human3, 18));
    }
}