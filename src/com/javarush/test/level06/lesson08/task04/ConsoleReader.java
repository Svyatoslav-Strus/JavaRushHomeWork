package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s = reader.readLine();//Напишите тут ваш код
        return s;
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        return n;//Напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        double m = Double.parseDouble(reader.readLine());//Напишите тут ваш код
        return m;
    }

    public static void readLn() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        while(reader.read() != '\n' )
        {

        }//Напишите тут ваш код

    }
}
