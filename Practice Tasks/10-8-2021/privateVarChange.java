public class privateVarChange {
    
    public static void main(String args[])
    {
        A obj = new A();           //by changing private variables we use setter and getter method...

        obj.set(12);
        obj.no1 = 10;

        //we can directly access number1 //because its public
        System.out.println("Number1 is : "+obj.no1);
        //we can't directly access number2 //because its private
        obj.get();
    }
}

class A {

    public int no1;
    private int no2;

    void set(int n)
    {
        no2 = n;
    }
    void get()
    {
        System.out.println("Number2 is : "+no2);
    }
}