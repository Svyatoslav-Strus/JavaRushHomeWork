package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        String fileThree = reader.readLine();
        reader.close();

        FileOutputStream outputFirst = new FileOutputStream(fileOne);
        FileInputStream inputSecond = new FileInputStream(fileTwo);
        FileInputStream inputThird = new FileInputStream(fileThree);

        byte[] buffer2 = new byte[inputSecond.available()];

        inputSecond.read(buffer2);
        outputFirst.write(buffer2);

        byte[] buffer3 = new byte[inputThird.available()];

        inputThird.read(buffer3);
        outputFirst.write(buffer3);

        outputFirst.close();
        inputSecond.close();
        inputThird.close();
    }
}
