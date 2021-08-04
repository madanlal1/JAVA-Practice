import java.util.Scanner;

class TotalCost {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no of Large Boxes: ");
        int large = input.nextInt();

        System.out.print("Enter no of Medium Boxes: ");
        int medium = input.nextInt();

        System.out.print("Enter no of Small Boxes: ");
        int small = input.nextInt();

        int count = large + medium + small;

        float large_cost = 3.6f * large;
        float medium_cost = 1 * medium;
        float small_cost = 0.6f * small;
        float totalCost = large_cost + medium_cost + small_cost;

        System.out.println("\n\nNumber of Bags Ordered: "+count);
        System.out.println("The cost of Order: $"+totalCost);
    }
}