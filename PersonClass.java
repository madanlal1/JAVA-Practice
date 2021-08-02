public class PersonClass {

    int id;
    String name;
    char gender;

    void Display(int id, String name, char gender)
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
    }
    public static void main(String args[])
    {
        PersonClass obj1 = new PersonClass();
        obj1.Display(12,"Madan",'M');
    }
}
