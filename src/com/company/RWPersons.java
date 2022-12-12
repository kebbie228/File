package com.company;

import java.io.*;
//"src/data/persons.bin"
public class RWPersons {//read,write
    public static void main(String[] args) throws IOException, ClassNotFoundException {
write();
read();
    }
    public static void write() throws IOException {
        FileOutputStream file = new FileOutputStream("src/data/persons.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
        Persons persons = new Persons();

        Person person = new Person(1,"Ivan");
        person.addEmail(" 1@gmail.com ");
        person.addEmail(" 2@gmail.com ");
        persons.addPerson(person);

        Person person2 = new Person(2,"Ivan2");
        person2.addEmail(" 3@gmail.com ");
        person2.addEmail(" 4@gmail.com ");
        persons.addPerson(person2);

        out.writeObject(persons);

        out.close();
        file.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("src/data/persons.bin");
        ObjectInputStream in = new ObjectInputStream(file);
        Persons persons = (Persons) in.readObject();
        for (Person person: persons.getPersons())
            System.out.println(person);

    }
}
