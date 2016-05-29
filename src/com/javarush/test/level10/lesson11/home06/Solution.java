package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private String surname;
        private int age;
        private String adress;
        private int phone;
        private String car;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, String adress)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.adress = adress;
        }

        public Human(String name, String surname, int age, String adress, int phone)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.adress = adress;
            this.phone = phone;
        }

        public Human(String name, String surname, int age, String adress, int phone, String car)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.adress = adress;
            this.phone = phone;
            this.car = car;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(String surname, int age)
        {
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, int age, int phone)
        {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public Human(String surname, String adress, String car)
        {
            this.surname = surname;
            this.adress = adress;
            this.car = car;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
