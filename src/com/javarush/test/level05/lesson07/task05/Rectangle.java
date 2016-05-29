package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle{

    private int top = 2;
    private int left = 2;
    private int width = 2;
    private int height = 2;

    public void initialize(int top, int left, int width, int height)    {

        this.top = 1;
        this.left = 1;
        this.width = 3;
        this.height = 1;

    }//Напишите тут ваш код

    public void initialize(int top, int left){

        this.top = top;
        this.left = left;
        this.width = this.height = 0;
    }

    public void initialize(int top, int left, int width){

        this.top = top;
        this.left = left;
        this.height = this.width = width;
    }

    public void initialize(Rectangle r){

        this.top = r.top;
        this.left = r.left;
        this.height = r.height;
        this.width = r.width;
    }
}
