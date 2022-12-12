package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBin {
    public static void main(String[] args) {
        String fileName = "src/data/data.bin";
        try(FileInputStream fis=new FileInputStream(fileName);
            DataInputStream din=new DataInputStream(fis);)
        {
            String text = din.readUTF(); //Не надо заботиться о длине считываемой строки
            double value = din.readDouble();
            int i = din.readInt();
            System.out.printf("text: %s, double: %f, int: %d%n", text,value,i);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
