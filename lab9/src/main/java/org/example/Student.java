package org.example;

import java.util.Objects;

public class Student extends Human
{
    private final String university;
    private final String faculty;
    private final String specialization;


    public Student(String surname, String name, String patronymic, int age, char sex, String university, String faculty, String specialization)
    {
        super(surname, name, patronymic, age, sex);
        this.university = university;
        this.faculty = faculty;
        this.specialization = specialization;
    }

    public String getUniversity()
    {
        return university;
    }

    public String getFaculty()
    {
        return faculty;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty) && Objects.equals(university, student.university) && Objects.equals(specialization, student.specialization);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), faculty, university, specialization);
    }

}
