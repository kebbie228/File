package com.company;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) throws IOException {
        JSONObject person=new JSONObject();
        person.put("id",1);
        person.put("name","Ivan");

        JSONArray emails= new JSONArray();
        emails.put("1@gmail.com");
        emails.put("2@gmail.com");
        person.put("emails",emails);
person.put("emails",emails);
        FileWriter fw=new FileWriter("src/data/person.json");
        fw.write(person.toString());
        fw.flush();
        fw.close();
    }
}
