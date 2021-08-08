import java.util.Scanner;

public class findLastDigit {
    
    public static int lastDigit(int number)
    {
        String num = Integer.toString(number);
        char last = num.charAt(num.length() - 1);
        int LastDigit = Character.getNumericValue(last);  

        return LastDigit;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        int Last = lastDigit(number);
        System.out.println("\nLast digit is \'"+Last+"\'.");
    }
}
