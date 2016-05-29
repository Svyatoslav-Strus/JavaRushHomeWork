package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        String s3 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;


        if (a > b && a > c)
        {
            n1 = a;
            if (b > c)
            {
                n2 = b;
                n3 = c;
            }
            else
            {
                n2 = c;
                n3 = b;
            }
        }


        if (b > a && b > c)
        {
            n1 = b;
            if (a > c)
            {
                n2 = a;
                n3 = c;
            }
            else
            {
                n2 = c;
                n3 = a;
            }
        }


        if (c > a && c > b)
        {
            n1 = c;
            if (a > b)
            {
                n2 = a;
                n3 = b;
            }
            else
            {
                n2 = b;
                n3 = a;
            }
        }

        System.out.println(n1 + " " + n2 + " " + n3);
        }

}
