package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution()           {}
    public Solution(int w)      {}
    public Solution(double w)   {}

    private Solution(short w)   {}
    private Solution(Integer w) {}
    private Solution(String w)  {}

    protected Solution(Double w){}
    protected Solution(Object w){}
    protected Solution(char w)  {}

    Solution(float w)           {}
    Solution(boolean w)         {}
    Solution(byte w)            {}
}

