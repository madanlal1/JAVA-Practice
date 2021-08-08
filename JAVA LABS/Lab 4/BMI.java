import java.util.Scanner;

class BMI {

    public static double calculateBMI(double weight, double height)
    {
        double BMI = (weight / (height*height));    //BMI formula correction BMI = kg/m2
        return BMI;
    }

    public static String findStatus(double bmi)
    {
        String result = "";
        if(bmi < 18.5)
        {
            result = "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9)
        {
            result = "Normal";
        }
        else if(bmi >= 25.0 && bmi <= 29.9)
        {
            result = "Overweight";
        }
        else if(bmi >= 30)
        {
            result = "Obese";
        }

        return result;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Weight : ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height : ");
        double height = input.nextDouble();
        
        double BMI = calculateBMI(weight, height);
        
        String status = findStatus(BMI);
        System.out.println("Your BMI Status is : "+status);
        
    }
}