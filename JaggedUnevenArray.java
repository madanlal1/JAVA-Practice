import java.util.Scanner;

public class JaggedUnevenArray {
    
    public static void main(String args[])
    {

        Scanner obj = new Scanner(System.in);
        
        int jaggedArray[][] = new int[3][];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                jaggedArray[i][j] = obj.nextInt();
            }

        }

        for(int k=0; k<3; k++)
        {
            for(int l=0; l<k+1; l++)
            {
                System.out.print(jaggedArray[k][l]);
            }
                System.out.println();
        }
    }
}
