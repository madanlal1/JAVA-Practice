import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print("How many Fabonacci digit to print : ");
        int count = obj.nextInt(); 

        System.out.print(num1+", "+num2+", ");

        for(int i=2; i<=count; i++)
        {
            num3 = num1 + num2;
            System.out.print(num3+", ");
            num1 =num2;
            num2 = num3;
        }

    }
}
