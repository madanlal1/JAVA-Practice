import java.util.Scanner;

class Temperature {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float temp = input.nextFloat();

        float Fahrenheit = (1.8f * temp) +32f;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
    }
}