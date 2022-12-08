package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    public static void main(String[] args) {
//Задаем имя файла
        String fileName = "src/data/data";
        StringBuilder sb = null;
        try (FileReader fr = new FileReader(fileName)) {
            System.out.println("Character encoding: " + fr.getEncoding());
            sb = new StringBuilder();
            int i;
            while ((i =
                    fr.read
                            ()) != -1) {
                sb.append((char) i);
            }
            fr.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Парсинг текстового файла
        String s = sb.toString();
        s = s.replaceAll("[^-\\+\\.0-9]","");
        double x = Double.parseDouble(s);
        System.out.println(x);
    }
}
// колекция из объектов сортир по опред принципу