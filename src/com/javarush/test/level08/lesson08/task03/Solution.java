package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Ваня");//Напишите тут ваш код
        map.put("Иванов1", "Ваня");//Напишите тут ваш код
        map.put("Иванов2", "Ваня");//Напишите тут ваш код
        map.put("Иванов3", "Ваня");//Напишите тут ваш код
        map.put("Иванов4", "Ваня");//Напишите тут ваш код
        map.put("Иванов5", "Ваня");//Напишите тут ваш код
        map.put("Иванов6", "Ваня");//Напишите тут ваш код
        map.put("Иванов7", "Ваня");//Напишите тут ваш код
        map.put("Иванов8", "Ваня");//Напишите тут ваш код
        map.put("Иванов9", "Ваня");//Напишите тут ваш код
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;
        //Напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (familiya.equals(key))
            {
                count++;
            }
        }//Напишите тут ваш код
        return count;
    }
}
