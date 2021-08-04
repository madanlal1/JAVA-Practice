public class Vehicle {

    public static void Car(int no_of_seats, int no_of_wheels) {
        System.out.println("Number of Seats car: "+no_of_seats);
        System.out.println("Number of Wheels car: "+no_of_wheels);
    }

    public static void MotorCycle(int no_of_seats, int no_of_wheels) {
        System.out.println("Number of Seats bike: "+no_of_seats);
        System.out.println("Number of Wheels bike: "+no_of_wheels);
    }

    public static void main(String args[])
    {
        int no_of_seats  = 5;
        int no_of_wheels = 4;
        Car(no_of_seats,no_of_wheels);

        
        int _no_of_seats  = 2;
        int _no_of_wheels = 2;
        MotorCycle(_no_of_seats,_no_of_wheels);


        
    }
}
