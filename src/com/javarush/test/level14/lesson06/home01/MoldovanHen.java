package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ПК on 07.09.2015.
 */
public class MoldovanHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 90;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}