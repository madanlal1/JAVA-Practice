import java.util.Scanner;

public class task13 {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nHow many Apples do you buy : ");
        int apple = input.nextInt();
        System.out.print("\nHow many Banana do you buy : ");
        int banana = input.nextInt();
        System.out.print("\nHow many Mango do you buy : ");
        int mango = input.nextInt();
        System.out.print("\nHow many Peach do you buy : ");
        int peach = input.nextInt();
        System.out.print("\nHow many Grapes do you buy : ");
        int grapes = input.nextInt();
        

        task13 obj = new task13();

        obj.Cal_Price(apple,banana,mango,peach,grapes);
              
    }

    void Cal_Price(int apple, int banana, int mango, int peach, int grapes)
    {
        int total = apple*160+banana*120+mango*110+peach*100+grapes*130;
        System.out.println("\nTotal price of your purchase is : "+total);
    }

}
