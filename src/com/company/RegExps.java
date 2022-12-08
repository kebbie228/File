package com.company;

import org.w3c.dom.NameList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExps {
    public static void main(String[] args) throws IOException {
        //строка содержит только один символ
        String s1 = "da", s2 = "ab";
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher(s1);
        System.out.println(matcher.matches());
        check(".", "d", "aa");
        check(".{5}", "123456", "12345");

//Строка содержит одну или более букву "a", а за ней одну букву "b"
        check("a+b", "aab", "abb");

//Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b", "b", "abb");

//Слово состоит из двух букв, первая из которых "a"
        check("a.", "ab", "abb");

        // последняя буква в строке -"a"
        check(".a*", "ba", "abb");

        //третья позиция - а
        check("{2}a.*", "ba", "abb");

        //первая и последняя буквы а
        check("a.*a", "aba", "aa");

        //первая и последння буквы одинаковы
        check("(.).*\\1", "bcbb", "acbb");

        //не начинается с буквы а или b
        check("[^ab].*", "cbb", "aacbb");

       //четные символы - а
        check("(.a)+", "bab   aba", "dacbb");

//Строка не содержит "a"
        check("[^a]+", "bababa", "dacbb");

        //Слово содержит букву "a"
        check("[a-zA-Z]*a[a-zA-Z]*", "bababa", "dacbb");//только слово

        //В строке содержатся цифры
        check("[a-zA-Z]*\\d[a-zA-Z]*", "baba2ba", "dacbb");

        //В строке содержатся цифры
        check("\\d+", "baba2ba", "1234");

        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+[.]?\\d*?", "+1", "b1cbb");

        //Проверить написание номера телефона в формате 8(023)-123-45-67
        check("8\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}", "8(023)-123-45-67", "98(023)-123-45-67");


       TextFileReader textFileReader = new TextFileReader("src/data/vocab");
        ArrayList list = (ArrayList) textFileReader.getList();
 for(int i=0;i< list.size();i++)
        if(pattern.compile(("[a-dA-D]+")).matcher((String) list.get(i)).matches())
            System.out.print(list.get(i)+" ");


    }

    public static void check(String pattern, String s1, String s2) {
        boolean b1 = Pattern.compile(pattern).matcher(s1).matches();
        boolean b2 = Pattern.compile(pattern).matcher(s2).matches();
        System.out.println(b1 + " " + b2);

    }
    //Из текстового файла-словаря извлекаются слова в массив строк
    static class TextFileReader {
        String fileName;
        private List<String> list = new ArrayList<String>();

        TextFileReader(String fileName) throws IOException {
            this.fileName = fileName;
            StringBuilder sb;
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    if (!line.equals(""))
                        list.add(line);
                    line = br.readLine();
                }
            }
        }

        public List<String> getList() {
            return list;
        }
    }
}

