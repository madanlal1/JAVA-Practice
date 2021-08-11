import java.util.Scanner;

public class task6 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);        
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        
        //taking Matrix1 Input
        for(int j=0; j<4; j++)
        {
            System.out.print("Enter ["+j+"]["+j+"] of Matrix A: ");
            array1[j] = input.nextInt(); 
        }
        
        //taking Matrix2 Input
        for(int k=0; k<4; k++)
        {
            System.out.print("Enter ["+k+"]["+k+"] of Matrix B: ");
            array2[k] = input.nextInt(); 
        }
        
        //Matrix Sum...
        System.out.print("\nMatrix Sum is : ");
        for(int s=0; s<4; s++)
        {
            int sum = array1[s]+array2[s];
            System.out.print(sum+" ");
        }
    }
    
}
