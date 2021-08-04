import java.util.Scanner;

class PersonAge {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your born year: ");
        int year = input.nextInt();

        int Year = 2021 - year;
        System.out.println("You are : "+Year+" years old.");
    }
}