import java.util.Scanner;

public class StrReverse {

    int count =0;
    
    void printReverse(String name)
    {
        if(count != name.length())
        {
            count++;
            System.out.print(name.charAt(name.length()-count));
            printReverse(name);   
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = input.nextLine();

        StrReverse obj = new StrReverse();
        obj.printReverse(name);

    }
}
