package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);

        int maxByte = inputStream.read();

        while (inputStream.available() > 0){

            int tmp = inputStream.read();

            if (maxByte < tmp){
                maxByte = tmp;
            }
        }

        inputStream.close();

        System.out.println(maxByte);
    }
}
