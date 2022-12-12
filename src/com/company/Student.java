package com.company;

public class Student {
    private String name;
    private int mark;
    private int grope;

    public Student(String name, int mark, int grope) {
        this.name = name;
        this.mark = mark;
        this.grope = grope;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public int getGrope() {
        return grope;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", grope=" + grope +
                '}';
    }
}
