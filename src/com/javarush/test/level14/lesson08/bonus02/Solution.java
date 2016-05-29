package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a < b){
            while (b !=0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            System.out.println(a);
        }

        else  if (a > b){
            while (a !=0) {
                int tmp = b % a;
                b = a;
                a = tmp;
            }
            System.out.println(b);;
        }

        else if (a == b)
        {
            System.out.println(a);
        }
    }
}
