package practice;
class StaticVariable
//instance variables or global variables
    static int a = m1();
    {
        System.out.println("manoj");
    }
    static int m1()
    {
        System.out.println("manoj1");
        return 10;
    }
  //local variables 	
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
}