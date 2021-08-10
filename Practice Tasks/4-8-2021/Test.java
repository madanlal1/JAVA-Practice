class Test {
                                        //Mehtod Overloading test...
    void test() 
    {
        System.out.println("No parameters");
    }
    
    void test(int n) 
    {
        System.out.println("N (integer) : "+n);
    }
    
    void test(double n) 
    {
        System.out.println("N (double) : "+n);
    }
    public static void main(String args[])
    {
        Test obj = new Test();

        obj.test();
        obj.test(22);
        obj.test(34.25);
    }
}