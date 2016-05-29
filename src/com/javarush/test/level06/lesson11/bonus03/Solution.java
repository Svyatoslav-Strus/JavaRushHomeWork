package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());
        int y = 0;

        for (int i = 0; i < 4; i++)
        {
            if (a1 > a2)
            {
                y = a1;
                a1 = a2;
                a2 = y;
            }
            if (a2 > a3)
            {
                y = a2;
                a2 = a3;
                a3 = y;
            }
            if (a3 > a4)
            {
                y = a3;
                a3 = a4;
                a4 = y;
            }
            if (a4 > a5)
            {
                y = a4;
                a4 = a5;
                a5 = y;
            }

        }

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.print(a5);

        //Напишите тут ваш код
    }
}
