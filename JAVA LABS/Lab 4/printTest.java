public class printTest {
    
    void test(int n, char c)
    {
        System.out.println("Number is \'"+n+"\' and Character is \'"+c+"\'.  (first-method called)");
    }
    void test(char c, int n)
    {
        System.out.println("Character is \'"+c+"\' and Number is \'"+n+"\'.  (second-method called)");
    }

    public static void main(String args[])
    {
        printTest obj = new printTest();
        obj.test(2,'a');
        obj.test('c',5);
    }
}