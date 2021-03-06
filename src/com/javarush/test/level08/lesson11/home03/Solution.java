package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        HashMap<String,String> map = new HashMap<String, String>();

        map.put("Ivanov", "Ivan9");
        map.put("Ivanov1", "Ivan8");
        map.put("Ivanov2", "Ivan7");
        map.put("Ivanov3", "Ivan6");
        map.put("Ivanov4", "Ivan5");
        map.put("Ivanov5", "Ivan3");
        map.put("Ivanov", "Ivan5");
        map.put("Ivanov1", "Ivan6");
        map.put("Ivanov2", "Ivan9");
        map.put("Ivanov3", "Ivan8");


        //Напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
