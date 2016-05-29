package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] mas1 = {1, 2, 3, 4, 5};
        int[] mas2 = {1, 2};
        int[] mas3 = {1, 2, 3, 4};
        int[] mas4 = {1, 2, 3, 4, 5, 6, 7};
        int[] mas5 = {};

        ArrayList<int[]> l = new ArrayList<int[]>();
        l.add(mas1);
        l.add(mas2);
        l.add(mas3);
        l.add(mas4);
        l.add(mas5);

        return l;
        //Написать тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
