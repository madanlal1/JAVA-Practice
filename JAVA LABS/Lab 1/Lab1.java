import java.util.Scanner;

class Lab1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a : ");
        int a = input.nextInt();
        System.out.print("Enter value b : ");
        int b = input.nextInt();
        System.out.print("Enter value c : ");
        int c = input.nextInt();

        if(a > b && a > c)
            System.out.println("a is greater.");
        else if(b > a && b > c)
            System.out.println("b is greater.");
        else 
            System.out.println("c is greater.");
    }
}