//This program shows different ways how Functions/Methods work in Java

//Example 1 -
class Functions {
    public static void main(String[] args)
    { 
        System.out.println("Before Call");
        fun();
        System.out.println("After Call");
    }
    
    public static void fun()
    {
        System.out.println("Inside Fun");
    }
}

//Example 2 -
class Example2 {
    public static void main(String[] args)
    { 
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main Ends");
    } 
    
    public static void fun1()
    {
        System.out.println("fun1 Begins");
        fun2();
        System.out.println("fun1 Ends");
    }
    
    public static void fun2()
    {
        System.out.println("Inside fun2");
    }
}

//Example 3 -
class Example3 {
    public static void main(String[] args)
    {
        fun();
        fun();
    } 
    
    public static void fun()
    {
        int x = 5, y = 10;
        
        System.out.println(x+y);
    }
}

//Example 4 -
class Example4 {
    public static void main(String[] args) 
    {
        int x = 5, y = 10;
        System.out.println(getMax(x, y));
    } 
    
    public static int getMax(int x, int y)
    {
        if(x > y)
        return x;
        
        else
        return y;
    }
}

//Example 5 -
class Point
{
    int x;
    int y;
}
class Gfg
{ 
    public static void main(String[] args) 
    {
        Point p = new Point();
        
        p.x = 5; p.y = 10;
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y);
    } 
    
    public static void fun(Point p)
    {
        p.x = 10; p.y = 10;
    }
}