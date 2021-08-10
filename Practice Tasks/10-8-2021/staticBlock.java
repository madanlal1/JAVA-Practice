public class staticBlock {
    
    public static void main(String args[])
    {
        useStatic obj = new useStatic();
        obj.meth(42);
    }
}

class useStatic {

    static int a = 3;
    static int b;

    static void meth(int x)
    {
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static {

        System.out.println("static block initialized.");
        b = a*4;
    }
}