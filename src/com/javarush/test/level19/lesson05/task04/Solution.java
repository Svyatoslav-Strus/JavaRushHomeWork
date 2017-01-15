package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        reader.close();

        String s = "";
        while (fr.ready()){
            String tmp = "";
            char c = (char) fr.read();
            tmp = String.valueOf(c).toLowerCase();
            if (tmp.equals(".")){
                s += "!";
            } else {
                s += tmp;
            }
        }

        fw.write(s);
        fr.close();
        fw.close();
    }
}
