import java.util.Scanner;

class PrimeNumber 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        boolean flag = true;

        System.out.print("Enter Number : ");
        int num = obj.nextInt();

        for(int i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                flag = false;
            }
        }

        if(flag)
        {
            System.out.println("\nNumber is Prime.");
        }
        else
        {
            System.out.println("\nNumber is not Prime.");
        }

    }
}