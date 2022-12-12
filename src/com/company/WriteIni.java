package com.company;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class WriteIni {
    public static void main(String[] args) {
        String fileName="src/data/data.ini";
        File file=new File(fileName);
        try {
            file.createNewFile();
            Wini ini=new Wini(file);

            ini.put("options", "name", "Изделие №1");
            ini.put("options", "number", 12345);
            ini.put("options", "value", 3.2);
            ini.store();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
