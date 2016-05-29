package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();//Напишите тут ваш код
        String s3 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);//Напишите тут ваш код
        int c = Integer.parseInt(s3);//Напишите тут ваш код
        int x = 0;

        if (a < b && b < c)
        {
            x = b;
        }

        if (b < a && a < c)
        {
            x = a;
        }

        if (b < c && c < a)
        {
             x = c;
        }

        System.out.println(x);
//Напишите тут ваш код
//Напишите тут ваш код
    }
}
