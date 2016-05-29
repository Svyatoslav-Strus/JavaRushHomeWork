package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 5, 15);
        Dog nonameDog = new Dog("N0name", 9999, 1);

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int age;
        int mass;

        public Cat(String name, int age, int mass)
        {
            this.name = name;
            this.age = age;
            this.mass = mass;
        }
    }

    public static class Dog
    {
        String name;
        int power;
        int kickass;

        public Dog(String name, int power, int kickass)
        {
            this.name = name;
            this.power = power;
            this.kickass = kickass;
        }
    }
    //Напишите тут ваши классы

}
