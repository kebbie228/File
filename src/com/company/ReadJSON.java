package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJSON {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("src/data/person.json");
        JSONTokener tokener=new JSONTokener(fr);
        JSONObject person=new JSONObject(tokener);

        int id=person.getInt("id");
        String name=person.getString("name");
        JSONArray emails=person.getJSONArray("emails");
        for(int i=0;i< emails.length();i++)
        System.out.println(emails.get(i));


    }
}
