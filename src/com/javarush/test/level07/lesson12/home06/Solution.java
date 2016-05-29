package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gp1 = new Human("gp1", true, 54, null, null);
        Human gp2 = new Human("gp2", true, 53, null, null);
        Human gm1 = new Human("gm1", false, 52, null, null);
        Human gm2 = new Human("gm2", false, 51, null, null);
        Human p = new Human("p", true, 34, gp1, gm1);
        Human m = new Human("m", false, 34, gp2, gm2);
        Human k1 = new Human("k1", true, 15, p, m);
        Human k2 = new Human("k2", false, 14, p, m);
        Human k3 = new Human("k3", true, 13, p, m);

        System.out.println(gp1);
        System.out.println(gp2);//Написать тут ваш код
        System.out.println(gm1);//Написать тут ваш код
        System.out.println(gm2);//Написать тут ваш код
        System.out.println(p);//Написать тут ваш код
        System.out.println(m);//Написать тут ваш код
        System.out.println(k1);//Написать тут ваш код
        System.out.println(k2);//Написать тут ваш код
        System.out.println(k3);//Написать тут ваш код

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }//Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
