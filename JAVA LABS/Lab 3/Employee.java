class Employee {
    public static void main(String args[])
    {
        EmployeeInfo obj1 = new EmployeeInfo();

        obj1.getInfo(2900,4);
        obj1.getInfo(2200,8);
        obj1.getInfo(3100,12);
        
    }
}

class EmployeeInfo {

    void getInfo(int salary,int hoursOfWork) {
        if(hoursOfWork>6)
        {
            int newSalary = AddWork(salary);
            System.out.println("Your New Salary is : "+newSalary);
        }
        else 
        {
            System.out.println("Your Salary is : "+salary);
        }
    }
    
    int AddWork(int salary) {
        
        return salary+=5;
    }
}