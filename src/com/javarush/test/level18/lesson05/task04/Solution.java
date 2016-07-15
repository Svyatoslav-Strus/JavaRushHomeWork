package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));
        FileOutputStream outputStream = new FileOutputStream(new File(reader.readLine()));
        reader.close();

        byte[] buffer = new byte[inputStream.available()];

        for(int i = inputStream.read(buffer); i > 0; i--)
            outputStream.write(buffer[i-1]);
        inputStream.close();
        outputStream.close();
    }
}
