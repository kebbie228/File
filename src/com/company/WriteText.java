package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    public static void main(String[] args) {
        String fileName="src/data/data";

        //создать файл
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.printf("Не удалось создать файл \"%s\"", fileName);
        }
        if (fw==null) return;

        try {
            fw.append("Строка");
            fw.append(((Double) 1.92).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
