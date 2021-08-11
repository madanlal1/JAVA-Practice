import java.util.Scanner;

public class task5 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);        
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        
        //taking Array1 Input
        for(int j=0; j<7; j++)
        {
            System.out.print("Element "+(j+1)+" in A : ");
            array1[j] = input.nextInt(); 
        }
        
        //taking Array2 input
        for(int k=0; k<7; k++)
        {
            System.out.print("Element "+(k+1)+" in B : ");
            array2[k] = input.nextInt(); 
        }
        
        //comparing arrays
        boolean flag = false;
        int count = 0;
        while(count<7)
        {
            if(array1[count] == array2[count])
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
            count++;
        }
        if(flag)
            System.out.print("Two arrays are the same.");
        else
            System.out.print("Two arrays are not the same!");
    }
    
}
