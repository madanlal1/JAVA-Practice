import java.util.Scanner;

public class task8 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);     
        int[][][] array1 = new int[2][2][4];
        
        //taking Matrix1 Input
        for(int j=0; j<2; j++)
        {
            for(int a=0; a<2; a++)
            {
                for(int b=0; b<4; b++)
                {
                    System.out.print("\nEnter ["+j+"]["+a+"]["+b+"] of Matrix A: ");
                    array1[j][a][b] = input.nextInt(); 
                }
            }
        }

        //printing values...
        for(int j=0; j<2; j++)
        {
            for(int a=0; a<2; a++)
            {
                for(int b=0; b<4; b++)
                {
                    System.out.print(array1[j][a][b]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }   
}