package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();    //Напишите тут ваш код
        String number2 = reader.readLine();

        int m = Integer.parseInt(number1);
        int n = Integer.parseInt(number2);
        int x = n;

        for (; m > 0; m--)
        {
            for (; n > 0; n--)
            {
                System.out.print("8");
            }//Напишите тут ваш код
            System.out.println();
            n = x;
        }
    }
}
