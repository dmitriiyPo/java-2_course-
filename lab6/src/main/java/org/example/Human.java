package org.example;

import java.util.Objects;

public class Human implements Comparable //интерфейс компарабл. Чтобы наши объекты можно было сравнить друг с другом
{                                        //и как-то сортировать, класс должен реализовать его единстенный метод compareTo()
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    public Human(String surname, String name, String patronymic, int age) // по параметрам
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        if (age < 0)
        {
            this.age = -1 * age;
        }
        else
        {
            this.age = age;
        }
    }
    public Human(Human human) //копирования
    {
        this.surname = human.getSurname();
        this.name = human.getName();
        this.patronymic = human.getPatronymic();
        this.age = human.getAge();
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (age < 0)
        {
            this.age = -1 * age;
        } else
        {
            this.age = age;
        }
    }
    public String getPatronymic()
    {
        return patronymic;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(surname, human.surname) && Objects.equals(name, human.name) && Objects.equals(patronymic, human.patronymic);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(surname, name, patronymic, age);
    }

    @Override
    public String toString()
    {
        return  surname + " " + name + " " + " " + patronymic + "age: " + age;
    }

    @Override
    public int compareTo(Object o) //сравнение двух объектов дает 3 возможнв варикант a < b a > b a ==b
    {
        Human d = (Human) o; //подаем объект и в этот момент он становиться Human, если он и так был то остается, надо чтоб гетер заработал
        //sort
        return this.surname.compareTo(d.getSurname());
    }
}
