import java.util.Scanner;

public class task4 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int[] arrayReverse = new int[10];

        //taking input
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter "+(i+1)+" number : ");
            array[i] = input.nextInt();
        }

        System.out.print("\nOriginal Array : ");
        //printing array
        for(int j=0; j<10; j++)
        {
            System.out.print(array[j]+", ");
        }
        
        //printing and storing reverse array
        System.out.print("\nReverse Array : ");
        int count =0;
        for(int k=9; k>=0; k--)
        {
            arrayReverse[count++] = array[k];
            System.out.print(array[k]+", ");
        }
    }
    
}
