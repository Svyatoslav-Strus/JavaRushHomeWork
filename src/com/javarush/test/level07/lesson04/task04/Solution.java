package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arri = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arri.length; i++)
        {
            arri[i] = Integer.parseInt(reader.readLine());
        }
        int x = 0;
        for (int i = 0; i < 5; i++)
        {
            x = arri[i];
            arri[i] = arri[arri.length - 1 - i];
            arri[arri.length - i - 1] = x;
        }
        for (int i = 0; i < arri.length; i++)
        {
            System.out.println(arri[i]);
        }//Напишите тут ваш код

    }
}
