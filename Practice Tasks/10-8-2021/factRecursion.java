class factRecursion {

    public static void main(String args[])
    {
        factRecursion obj = new factRecursion();

        System.out.println("Factorial of 5 is : "+obj.fact(5));
    }

    int fact(int n)
    {
        int result;

        if(n == 0 || n == 1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}