package com.javarush.test.level15.lesson12.home05;

/**
 * Created by ПК on 24.09.2015.
 */
public class SubSolution extends Solution
{

    public SubSolution()               {   }
    public SubSolution(int w)          {super(w);}
    public SubSolution(double w)       {super(w);}

    private SubSolution(short w)       {super(w);}
    private SubSolution(Integer w)     {super(w);}
    private SubSolution(String w)      {super(w);}

    protected SubSolution(Double w)    {super(w);}
    protected SubSolution(Object w)    {super(w);}
    protected SubSolution(char w)      {super(w);}

    SubSolution(float w)               {super(w);}
    SubSolution(boolean w)             {super(w);}
    SubSolution(byte w)                {super(w);}
}
