import java.util.Scanner;

public class task9 {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);     
        int[][][][] array1 = new int[2][2][2][2];
        
        //taking Matrix1 Input
        for(int j=0; j<2; j++)
        {
            for(int a=0; a<2; a++)
            {
                for(int b=0; b<2; b++)
                {
                    for(int c=0; c<2; c++)
                    {
                        System.out.print("\nEnter ["+j+"]["+a+"]["+b+"]["+c+"] of Matrix A: ");
                        array1[j][a][b][c] = input.nextInt(); 
                    }
                }
            }
        }

        //printing values...
        for(int w=0; w<2; w++)
        {
            for(int x=0; x<2; x++)
            {
                for(int y=0; y<2; y++)
                {
                    for(int z=0; z<2; z++)
                    {
                        System.out.print(array1[w][x][y][z]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }   
}