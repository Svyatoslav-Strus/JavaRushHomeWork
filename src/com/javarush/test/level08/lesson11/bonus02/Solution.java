package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> city = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();

        while (true)
        {
            if ( reader.readLine().isEmpty() )
            {break;}
            city.add(reader.readLine());
            name.add(reader.readLine());
        }

        String cityS = reader.readLine();

        for (int i = 0; i < city.size(); i++)
        {
            if (cityS.equals(city.get(i)))
            {
                System.out.println(name.get(i));
            }
        }
        //list of addresses

    }
}
