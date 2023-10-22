package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.List.*;


class ReflectionDemoTest
{

    @org.junit.jupiter.api.Test
    void howManyPeople() {
        List<Object> objectList = new ArrayList<>(of("ppppppp", new Human("", "", ""),
                new Human(".", ".", "."), "dvsv", "cast", new Student("", "",
                        "", "", "", "")));
        assertEquals(3, ReflectionDemo.HowManyPeople(objectList));
    }

    @org.junit.jupiter.api.Test
    void methodList() {
        List<String> list1 = new ArrayList<>(of("public java.lang.String org.example.Human.getName()",
                "public boolean org.example.Human.equals(java.lang.Object)", "public java.lang.String org.example.Human.toString()",
                "public int org.example.Human.hashCode()", "public void org.example.Human.setName(java.lang.String)",
                "public java.lang.String org.example.Human.getSurname()", "public java.lang.String org.example.Human.getPatronymic()",
                "public void org.example.Human.setSurname(java.lang.String)", "public void org.example.Human.setPatronymic(java.lang.String)",
                "public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException",
                "public final void java.lang.Object.wait(long) throws java.lang.InterruptedException",
                "public final void java.lang.Object.wait() throws java.lang.InterruptedException",
                "public final native java.lang.Class java.lang.Object.getClass()",
                "public final native void java.lang.Object.notify()",
                "public final native void java.lang.Object.notifyAll()",
                "public final java.lang.String org.example.Human.getStr()", "public final void org.example.Human.setStr(java.lang.String)"));
        List<String> list2 = ReflectionDemo.MethodList(new Human("", "", ""));
        Collections.sort(list1);
        Collections.sort(list2);
        assertEquals(list1, list2);
    }
    @org.junit.jupiter.api.Test
    void getSuperClasses() {
        List<String> list1 = new ArrayList<>(of("class java.lang.Object"));
        assertEquals(list1, ReflectionDemo.getSuperClasses(new Human("", "", "")));
        List<String> list2 = new ArrayList<>(of("class org.example.Human", "class java.lang.Object"));
        assertEquals(list2, ReflectionDemo.getSuperClasses(new Student("", "", "", "",
                "", "")));
    }

    @Test
    void implementsAnExecutable() {
        List<Object> objectList = new ArrayList<>(List.of("ppppppp", new Human("", "", ""),
                new Human(".", ".", "."), "dvsv", "cascva", new Student("", "",
                        "", "", "", ""), new unt()));
        assertEquals(2, ReflectionDemo.ImplementsAnExecutable(objectList));
    }

    @Test
    void getSetAndGet() {
        List<String> list1 = new ArrayList<>(of("public java.lang.String org.example.Human.getName()",
                "public void org.example.Human.setName(java.lang.String)", "public java.lang.String org.example.Human.getSurname()",
                "public java.lang.String org.example.Human.getPatronymic()", "public void org.example.Human.setSurname(java.lang.String)",
                "public void org.example.Human.setPatronymic(java.lang.String)", "public final void org.example.Human.setStr(java.lang.String)",
                "public final java.lang.String org.example.Human.getStr()"));
        List<String> list2 = ReflectionDemo.getSetAndGet(new Human("", "", ""));
        Collections.sort(list1);
        Collections.sort(list2);
        assertEquals(list1, list2);
    }

    static class unt extends Student {
        public unt() {
            super("surname", "name", "patronymic", "faculty", "university",
                    "speciality");
        }
    }
}