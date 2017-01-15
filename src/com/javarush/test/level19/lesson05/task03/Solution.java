package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        reader.close();

        String str = "";
        while (fr.ready()){
            char c = (char) fr.read();
            str += String.valueOf(c).toLowerCase();
        }

        String[] buffer = str.split(" ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (String s : buffer){
            try{
                numbers.add(Integer.parseInt(s));
            }catch(NumberFormatException e){

            }
        }

        for (Integer n : numbers){
            fw.write(n + " ");
            System.out.print(n + " ");
        }

        fr.close();
        fw.close();

    }
}
