import java.util.Scanner;

public class task12 {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter 2nd number : ");
        float num2 = input.nextFloat();

        System.out.println("\n1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subraction");
        System.out.println("3. Press 3 for Division");
        System.out.println("4. Press 4 for Multiplication");
        System.out.print("\nInput Here : ");
        int value = input.nextInt();

        task12 obj = new task12();

        switch (value)
        {
            case 1:
                float result1 = obj.sum(num1,num2);
                System.out.println("\nSum is : "+result1);
                break;
            
            case 2:
                float result2 = obj.sub(num1,num2);
                System.out.println("\nSubraction is : "+result2);
                break;
            
            case 3:
                float result3 = obj.div(num1,num2);
                System.out.println("\nDivision is : "+result3);
                break;
            
            case 4:
                float result4 = obj.mul(num1,num2);
                System.out.println("\nMultiplication is : "+result4);
                break;
            
        }         
    }

    float sum(float a,float b)
    {
        return a+b;
    }
    
    float sub(float a,float b)
    {
        return a-b;
    }

    float div(float a,float b)
    {
        return a/b;
    }

    float mul(float a,float b)
    {
        return a*b;
    }

}
