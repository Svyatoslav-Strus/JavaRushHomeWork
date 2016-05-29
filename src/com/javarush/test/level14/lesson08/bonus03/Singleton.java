package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by ПК on 24.11.2015.
 */
public class Singleton
{
    static Singleton instance = null;
    private Singleton()
    {
    }

    static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
