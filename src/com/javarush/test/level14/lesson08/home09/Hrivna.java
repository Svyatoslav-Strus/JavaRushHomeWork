package com.javarush.test.level14.lesson08.home09;

/**
 * Created by ПК on 08.09.2015.
 */
public class Hrivna extends Money
{
    public String getCurrencyName()
    {
        return "HRN";
    }

    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public double getAmount()
    {
        return super.getAmount();
    }
}
