public class task3 {
    
    public static void main(String args[])
    {
        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = new int[]{5,6,7,8,9,10};

        int arraySize = arr1.length+arr2.length;
        int arr3[] = new int[arraySize];

        task3 obj = new task3();
        obj.mergeList(arr1, arr2, arr3); 
    }

    void mergeList(int[] arr1, int[] arr2, int[] arr3)
    {
        int count = 0;

        for(int num1 : arr1)
        {
            arr3[count++] = num1;
        }
        
        for(int num2 : arr2)
        {
            arr3[count++] = num2;
        }

        System.out.print("\nMerger Array is : ");
        for(int i=0; i<count; i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}
