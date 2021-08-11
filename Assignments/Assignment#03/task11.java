import java.util.Scanner;

public class task11 {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Marks : ");
        int marks_subject = input.nextInt();

        task11 obj = new task11();

            obj.cal_grades(marks_subject);
    }

    void cal_grades(int marks_subject)
    {
        if(marks_subject < 0 || marks_subject > 100)
            System.out.print("Your entered wrong marks.");
        else if(marks_subject < 60)
            System.out.print("F Grade.");
        else if(marks_subject >= 60 && marks_subject < 70)
            System.out.print("C Grade.");
        else if(marks_subject >= 70 && marks_subject < 80)
            System.out.print("B Grade.");
        else if(marks_subject >= 80 && marks_subject < 90)
            System.out.print("A Grade.");
        else if(marks_subject >= 90 && marks_subject <= 100)
            System.out.print("A+ Grade.");
    }
}
