class task1 {

    public static void main(String args[])
    {
        //declaring array
        int[] array;
        //initializing array
        array = new int[]{1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for(int i=0; i<10; i++)
        {
            sum+=array[i];
        }
        System.out.println("Total Sum is : "+sum);
        System.out.println("Average is : "+sum/10);
    }
}