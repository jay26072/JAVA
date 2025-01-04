/* 27.Write a java program to implement Generic class Number_1 for both data type int and float in java.*/


class Number_1<T>
{
    T num;
    Number_1(T n)
    {
        num=n;
    }
    public T getNum()
    {
        return num;
    }
}

public class Ex27
{
    public static void main(String[] args)
    {
        Number_1 <Integer> iObj = new Number_1<Integer>(10);
        Number_1 <Float> fObj = new Number_1<Float>(10.5f);
        System.out.println("Integer value: "+iObj.getNum());
        System.out.println("Float value: "+fObj.getNum());
    }
}
