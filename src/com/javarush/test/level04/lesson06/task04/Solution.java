package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int length1 = s1.length();
        int length2 = s2.length();

        if ( s1.equals(s2) )
        {
            System.out.println("Имена идентичны");
        }
        else
        {
            if ( length1 == length2)
            {
                System.out.println("Длины имен равны");
            }
        }
        //Напишите тут ваш код

    }
}
