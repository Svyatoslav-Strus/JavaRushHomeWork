package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human ch1 = new Human("ch1", true, 10, new ArrayList<Human>());
        Human ch2 = new Human("ch2", true, 11 ,new ArrayList<Human>());
        Human ch3 = new Human("ch3", true, 12, new ArrayList<Human>());
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(ch1);
        ch.add(ch2);
        ch.add(ch3);

        Human p = new Human("p", true, 30, ch);
        Human m = new Human("m", false, 29, ch);
        ArrayList<Human> pp = new ArrayList<Human>();
        pp.add(p);
        ArrayList<Human> mm = new ArrayList<Human>();
        mm.add(m);

        Human gp1 = new Human("gp1", true, 70, mm);
        Human gp2 = new Human("gp2", true, 69, pp);
        Human gm1 = new Human("gm1", false, 70, mm);
        Human gm2 = new Human("gm2", false, 69, pp);

        System.out.println(gp1.toString());
        System.out.println(gp2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(p.toString());
        System.out.println(m.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());//Написать тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
