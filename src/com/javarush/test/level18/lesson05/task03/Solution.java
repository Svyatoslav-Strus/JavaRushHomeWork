package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputFile1 = new FileInputStream(new File(reader.readLine()));
        FileOutputStream outputFile2 = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream outputfile3 = new FileOutputStream(new File(reader.readLine()));

        while (inputFile1.available() > 0){
            if (inputFile1.available() % 2 == 0){
                byte[] o1 = new byte[inputFile1.available()/2];
                byte[] o2 = new byte[inputFile1.available()/2];
                int count1 = inputFile1.read(o1);
                int count2 = inputFile1.read(o2);
                outputFile2.write(o1, 0, count1);
                outputfile3.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[inputFile1.available()/2 + 1];
                byte[] o2 = new byte[inputFile1.available()/2];
                int count1 = inputFile1.read(o1);
                int count2 = inputFile1.read(o2);
                outputFile2.write(o1, 0, count1);
                outputfile3.write(o2, 0, count2);
            }
        }

        reader.close();
        inputFile1.close();
        outputFile2.close();
        outputfile3.close();
    }
}
