import java.util.Scanner;

public class task10 {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Month in numbers : ");
        int month = input.nextInt();

        task10 obj = new task10();
        if(month == 1 || month == 2 || month == 3 || month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 10 || month == 11 || month == 12)
            obj.month(month);
        else
            System.out.println("You entered wrong month");
    }

    void month(int month_of_year)
    {
        if(month_of_year == 1)
            System.out.print("Month is January.");
        else if(month_of_year == 2)
            System.out.print("Month is Febuary.");
        else if(month_of_year == 3)
            System.out.print("Month is March.");
        else if(month_of_year == 4)
            System.out.print("Month is April.");
        else if(month_of_year == 5)
            System.out.print("Month is May.");
        else if(month_of_year == 6)
            System.out.print("Month is June.");
        else if(month_of_year == 7)
            System.out.print("Month is July.");
        else if(month_of_year == 8)
            System.out.print("Month is August.");
        else if(month_of_year == 9)
            System.out.print("Month is September.");
        else if(month_of_year == 10)
            System.out.print("Month is Octomber.");
        else if(month_of_year == 11)
            System.out.print("Month is November.");
        else if(month_of_year == 12)
            System.out.print("Month is December.");
    }
}
