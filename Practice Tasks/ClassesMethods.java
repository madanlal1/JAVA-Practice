class ClassesMethod 
{
    double width;
    double height;
    double depth;

    //display values
    void Display()
    {
        System.out.println("Width : "+width);
        System.out.println("Height : "+height);
        System.out.println("Depth : "+depth);
    }

    //display volume
    void DisplayVolume()
    {
        double volume = width*height*depth;
        System.out.println("Volume : " + volume);
    }

    //double method returns value
    // double DisplayVolume1()
    // {
    //     double volume = width*height*depth;
    //     return volume;
    // }



    public static void main(String args[])
    {
        ClassesMethod b1 = new ClassesMethod();
        ClassesMethod b2 = new ClassesMethod();

        b1.width = 5.5;
        b1.height = 6.5;
        b1.depth = 7.5;

        b1.DisplayVolume();

        b2.width = 5.5;
        b2.height = 6.5;
        b2.depth = 7.5;


    }
}