package com.company;

import java.io.*;

public class RWPerson {//read,write
    public static void main(String[] args) throws IOException, ClassNotFoundException {
write();
read();
    }
    public static void write() throws IOException {
        FileOutputStream file = new FileOutputStream("src/data/person.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
    Person person=new Person(1,"Ivan");
    person.addEmail("1@gmail.com");
    person.addEmail("2@gmail.com");
    System.out.println(person.toString());
    out.writeObject(person);

    out.close();
    file.close();
    }
    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("src/data/person.bin");
        ObjectInputStream in = new ObjectInputStream(file);
        Person person= (Person) in.readObject();
        System.out.println(person.toString());
        
    }
}
