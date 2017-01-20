package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader(args[0]);

        TreeMap<String, Double> map = new TreeMap<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> dep = new ArrayList<>();

        BufferedReader reader = new BufferedReader(file);

        String[] buffer;
        String line;
        Double currentValue;

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
            names.add(key);
            dep.add(map.get(key));
        }

        Double max = Collections.max(dep);
        System.out.println(names.get(dep.indexOf(max)));

    }
}
