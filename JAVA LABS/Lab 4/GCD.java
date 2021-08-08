import java.util.Scanner;

public class GCD {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter 1st number : ");
        int n1 = input.nextInt();
    
        System.out.print("Enter 2nd number : ");
        int n2 = input.nextInt();
    
        GCD obj = new GCD();
        int Result = obj.gcd(n1,n2);
        System.out.println(Result+" is the Greatest Common Divisor.");
    }
    
    int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    
}
