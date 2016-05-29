package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name
Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/


import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int maxB = 0;
        int maxA = 0;
        int maxJ = 0;
        int maxI = 0;

        for (int ai = 0; ai < n; ai++)
        {
            if (scanner.hasNextInt())
            {
                A[ai] = scanner.nextInt();
                if (maxA < A[ai])
                {
                    maxA = A[ai]; maxI = ai;
                }
            }
        }
        for (int bi = 0; bi < n; bi++)
        {
            if (scanner.hasNextInt())
            {
                B[bi] = scanner.nextInt();
                if ( maxB <= B[bi] )
                {
                    maxB = B[bi]; maxJ = bi;
                }
            }
        }

        scanner.close();
        int maxInew = 0;
        int max = maxB + A[0];
        for (int i = 1; i <= maxJ; i++)
        {
            if (max < (maxB + A[i]))
            {
                max = maxB + A[i];
                maxInew = i;
            }
        }

        System.out.println(maxInew);
        System.out.println(maxJ);

    }
}