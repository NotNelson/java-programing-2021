package com.javaprogramming.ex3;

import com.javaprogramming.ex3.model.*;

public class Main {
    public static void main(String [] args) {
        Person person = new Person("Nelson", 33, "Male");
        Teacher teacher = new Teacher("Carl", 35, "Male", "Maths", 50.000);
        Student student = new Student("Phil", 25, "Male", "K7623", 83.1);
        UnderGradStudent undergrad = new UnderGradStudent("Erica", 31, "Female", "J2345", 84.2, 2020, "CS");

        System.out.println(person.toString());
        System.out.println(teacher.toString());
        System.out.println(student.toString());
        System.out.println(undergrad.toString());
    }
}
