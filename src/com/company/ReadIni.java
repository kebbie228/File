package com.company;

import org.ini4j.Ini;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIni {
    public static void main(String[] args) {


        String fileName = "src/data/data.ini";
        try {
            File file = new File(fileName);
            Wini ini = new Wini(file);

            /*
            Ini.Section options = ini.get("options");
            String desc = options.get("desc");
            String name = options.get("name");
            int number = options.get("number", Integer.class);
            double value = options.get("value", Double.class);
            System.out.printf("desc: %s, name: %s, number: %d, value: %f%n", desc,name,number,value);

             */

//Получить все содержимое ini файла
             //REDKO
            for (String sectionName : ini.keySet()) {
                System.out.println("[" + sectionName + "]");
                Ini.Section section = ini.get(sectionName);
                for (String optionKey : section.keySet()) {
                    System.out.println("\t" + optionKey + "=" + section.get(optionKey));
                }
            }

           //  */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}