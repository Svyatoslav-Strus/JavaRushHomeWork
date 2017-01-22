package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();

        while (file1.ready()){
            firstList.add(file1.readLine());
        }

        while (file2.ready()){
            secondList.add(file2.readLine());
        }

        int j = 0;
        for (int i = 0; i < firstList.size(); i++){
            if (j >= secondList.size()) {
                lines.add(new LineItem(Type.REMOVED, firstList.get(i)));
                break;
            } else
            if (firstList.get(i).equals(secondList.get(j))) {
                lines.add(new LineItem(Type.SAME, firstList.get(i)));
                j++;
            } else
            if (j < (secondList.size() - 1) && firstList.get(i).equals(secondList.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, secondList.get(j)));
                j++;
                i--;
            } else
            if (i < (firstList.size() - 1) && firstList.get(i + 1).equals(secondList.get(j))) {
                lines.add(new LineItem(Type.REMOVED, firstList.get(i)));
            }
        }
        if (lines.get(lines.size() - 1).type == Type.SAME && j <= (secondList.size() - 1) ) {
            lines.add(new LineItem(Type.ADDED, secondList.get(j)));
        }

        file1.close();
        file2.close();
        reader.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
