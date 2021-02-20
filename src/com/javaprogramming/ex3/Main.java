package com.javaprogramming.ex3;

import com.javaprogramming.ex3.model.Person;

public class Main {
    public static void main(String [] args) {
        Person person = new Person("Nels", 33, "Male");
        person.setAge(33);
        System.out.println(person);
    }
}
