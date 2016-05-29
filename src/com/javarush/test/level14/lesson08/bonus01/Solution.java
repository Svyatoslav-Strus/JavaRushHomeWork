package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //java.lang.ArithmeticException: / by zero
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //java.lang.ArrayIndexOutOfBoundsException: -1
        try {
            int[] i = new int[10];
            i[-1] = 0;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //java.lang.ArrayStoreException: java.lang.Integer
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        //java.lang.NegativeArraySizeException
        try {
            Object x[] = new String[-1];
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        //java.lang.NumberFormatException: For input string: "asd"
        try {
            String s = "asd";
            Integer n = Integer.parseInt(s);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        //java.lang.StringIndexOutOfBoundsException: String index out of range: 8
        try {
            String s = "asd";
            char s1;
            s1 = s.charAt(8);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        //java.lang.IndexOutOfBoundsException: Index: -1, Size: 0
        try        {
            LinkedList list = new LinkedList();
            list.get(-1);
        }
        catch (Exception e)        {
            exceptions.add(e);
        }

        //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        try        {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch (Exception e)        {
            exceptions.add(e);
        }

        //java.lang.IllegalStateException: MyException
        try {
            throw new IllegalStateException("MyException");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //java.lang.IllegalStateException: MyException

    }
}
