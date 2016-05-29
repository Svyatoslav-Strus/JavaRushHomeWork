package com.javarush.test.level09.lesson06.task03;

/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

import com.sun.org.apache.bcel.internal.generic.ExceptionThrower;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try//Напишите тут ваш код
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        //Напишите тут ваш код

    }
}
