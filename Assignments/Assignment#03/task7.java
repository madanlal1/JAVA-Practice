import java.util.Scanner;

public class task7 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);     
        int[][] array1 = new int[4][3];
        int[][] array2 = new int[4][3];
        
        //taking Matrix1 Input
        for(int j=0; j<4; j++)
        {
            for(int a=0; a<3; a++)
            {
                System.out.print("\nEnter ["+j+"]["+a+"] of Matrix A: ");
                array1[j][a] = input.nextInt(); 
            }
        }

        //original matrix
        System.out.println("\nOriginal Matrix : ");
        for(int j=0; j<4; j++)
        {
            for(int a=0; a<3; a++)
            {
                System.out.print(array1[j][a]+" ");
            }
            System.out.println();
        }
           
        //divide matrix by 5
        System.out.println("\nDivide Matrix by 5 : ");
        for(int j=0; j<4; j++)
        {
            for(int a=0; a<3; a++)
            {
                array2[j][a] = array1[j][a]/5; 
                System.out.print(array2[j][a]+" ");
            }
            System.out.println();
        }
    }   
}