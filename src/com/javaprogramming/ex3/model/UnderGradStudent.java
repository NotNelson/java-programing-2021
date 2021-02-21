package com.javaprogramming.ex3.model;

public class UnderGradStudent extends Student {
    protected int year;
    protected String major;

    public UnderGradStudent(String name, int age, String gender, String idNum,
                            double averageMark, int year, String major) {
        super(name, age, gender, idNum, averageMark);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
