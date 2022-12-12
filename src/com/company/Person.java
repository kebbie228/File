package com.company;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Person implements Serializable {// znat' nado
    private int id;
    private String name;

    private List<String> emails=new LinkedList<>();

    public Person(){}
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void addEmail(String email){
        emails.add(email);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
