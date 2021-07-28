import java.util.Scanner;

class Lab2 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();

        float division = (float)num1/(float)num2;

        System.out.println("Integer division Round Up Result : "+Math.round(division));
        
    }
}   
  
