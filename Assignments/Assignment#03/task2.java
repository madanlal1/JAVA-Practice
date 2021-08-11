import java.util.Scanner;
import java.util.Arrays;

class task2 {

    public static void main(String args[])
    {
        int[] array = {55, 63, 78, 98, 10, 24, 32, 55, 20, 47};

        //print array without loop
        System.out.print("First Array : "+ Arrays.toString(array) );
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter array size : ");
        int size = input.nextInt();
        
        int[] array1 = new int[size];
        
        //taking input
        for(int i=0; i<array1.length; i++)
        {
            System.out.print("\nEnter "+(i+1)+" Number : ");
            array1[i] = input.nextInt();
        }
        System.out.print("\nNew Array : ");
        //printing array
        for(int j=0; j<array1.length; j++)
        {
            System.out.print(array1[j]+", ");
        }
        
        //access fifth value from array
        System.out.print("\nFifth value from \'First\' array is : "+array[4]);
        
        //change value of 3rd value to 20
        array[2] = 20;
        System.out.print("\nFirst array 3rd value is changed to 20.");
        System.out.print("Updated First Array : "+ Arrays.toString(array) );
        
        //print odd values
        System.out.print("\nOdd values from first array : ");
        for(int k=0; k<array.length; k++)
        {
            if(array[k]%2 != 0)
            {
                System.out.print(array[k]+", ");
            }
        }
        
        //print odd indices values
        System.out.print("\nOdd Indices Values : ");
        for(int k=1; k<array.length; k+=2)
        {
                System.out.print(array[k]+", ");
        }
        
        //check input present in array
        System.out.print("\nEnter input to check from Array : ");
        int value = input.nextInt();

        boolean flag = false;
        for(int k=0; k<array.length; k++)
        {
            if(array[k] == value)
            {
                flag = true;
            }
        }
        if(flag)
            System.out.print(value+" is present in array.");
        else
            System.out.print(value+" is not present in array.");
            
            
        //take input and print greater and less values
        System.out.print("\nEnter input for greater numbers : ");
        int greater = input.nextInt();
        System.out.print("\nEnter input for less numbers : ");
        int less = input.nextInt();
        
        System.out.print("\nGreater Numbers are : ");
        for(int k=0; k<array.length; k++)
        {
            if(array[k] > greater)
            {
                System.out.print(array[k]+", ");
            }
        }

        System.out.print("\nLess Numbers are : ");
        for(int k=0; k<array.length; k++)
        {
            if(array[k] < less)
            {
                System.out.print(array[k]+", ");
            }
        }
    }
}