package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader(args[0]);
        TreeMap<String,Double> map = new TreeMap<String, Double>();
        String[] buffer;
        String line = "";
        Double currentValue;

        BufferedReader reader = new BufferedReader(file);

        while ((line = reader.readLine()) != null){
            buffer = line.split(" ");

            if (map.containsKey(buffer[0])){
                currentValue = map.get(buffer[0]);
                map.put(buffer[0], Double.valueOf(buffer[1]) + currentValue);
            } else {
                map.put(buffer[0], Double.valueOf(buffer[1]));
            }
        }

        reader.close();
        file.close();

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }
}
