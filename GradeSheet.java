import java.util.Scanner;

class GradeSheet
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Name");
        String Name = obj.nextLine();

        System.out.println("Enter Id");
        int Id = obj.nextInt();        

        obj.nextLine();             //we use bcoz: Int +then+ String issue:

        System.out.println("Gender");
        String Gender = obj.nextLine();        

        int marks[] = new int[6];

        for(int i=1; i<=5; i++)
        {
        System.out.println("Subject-"+i+" Marks");
        marks[i] = obj.nextInt();
        }

        System.out.println();       //for New Line (Space)
        int Grade = 0;

        for(int i=1; i<=5; i++)
        {
            Grade+=marks[i];
        }
            System.out.println("Total Grade Percentage is: "+Grade/5+"%");
    }
}