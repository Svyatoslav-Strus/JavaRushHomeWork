package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] list = s.toCharArray();
        int l = list.length;
        String x = "";
        System.out.println(s);

        for (int j = 0; j < 39; j++)
        {
            for (int i = 0; i < l-1 -j; i++)
            {
                list[i] = list[i+1];
                x += list[i];
            }
            System.out.println(x);
            x = "";

        }
        //Напишите тут ваш код
    }

}
