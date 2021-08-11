public class factWithoutRecursion {
    
    public static void main(String args[])
    {
        factRecursion obj = new factRecursion();

        System.out.println("Factorial of 5 is : "+obj.fact(5));
    }

    int fact(int num)
    {
        int result = 1;

        if(num == 0 || num == 1) return 1;
        while(num !=1)
        {
            result*=num;
            num--;
        }
        return result;
    }
}
