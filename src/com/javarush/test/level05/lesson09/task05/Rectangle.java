package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top = 2;
    private int left = 2;
    private int width = 2;
    private int height = 2;

    public Rectangle(int top, int left, int width, int height ){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = this.height = 0;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.height = this.width = width;
    }

    public Rectangle(Rectangle r){
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }
    //Напишите тут ваш код

}
