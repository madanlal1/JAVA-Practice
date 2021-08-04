public class overLoading {

    public static void main(String args[])
    {
        A obj1 = new A();
        A obj2 = new A();

        //default values from classA constructor
        System.out.println("n1 value in classA"+obj1.n1);
        System.out.println("n2 value in classA"+obj1.n2);
        System.out.println("n3 value in classA"+obj1.n3);

        // calling function 
        obj1.Sum(4,5);
        obj2.Sum(4,5,1);

    }
}


class A {

    int n1,n2,n3;

    A() {
        n1 = 2;
        n2 = 3;
        n3 = 4;
    }            //constructor Overloading (according to signature(parameter))..............................
    
    A(int n1, int n2) {
        n1 = 2;
        n2 = 3;
    }

    
    A(int n1, int n2, int n3) {
        n1 = 2;
        n2 = 3;
        n3 = 6;
    }

    void Sum(int n1, int n2)
    {
        System.out.println("Sum is : "+ Integer.sum(n1,n2));    //sum : 9
    }
                //Method Overloading.........................................................................

    void Sum(int n1, int n2, int n3)
    {
        //this will replace values to the Constructor values
        System.out.println("Sum before assigning parametric values : "+ (this.n1+this.n2+this.n3)); //sum : 9
        
        //assign parametric values
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        System.out.println("Sum after assigning parametric values : "+ (this.n1+this.n2+this.n3)); //sum : 10

    }


}