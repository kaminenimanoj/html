package practice;
class StaticVariable
{
    static int a = m1();
    {
        System.out.println("manoj");
    }
    static int m1()
    {
        System.out.println("manoj");
        return 10;
    }
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
}