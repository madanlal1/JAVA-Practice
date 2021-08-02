class StringMethods
{
    public static void main(String args[])
    {
        String FirstName = "Madan";
        String LastName = "Lal";

        //charAt return character at particular index
        System.out.println(FirstName.charAt(1));
        //codePointAt return AASCII
        System.out.println(FirstName.codePointAt(1));
        //codePointerBefore return AASCII of character before index
        System.out.println(FirstName.codePointBefore(1));
        //return AASCII of specified string
        System.out.println(FirstName.codePointCount(0,2));
        //compareTo compares two strings (if match return 0 else 1)
        System.out.println(FirstName.compareTo(LastName));
        //compare two string ignore case(capital/small)
        System.out.println(FirstName.compareToIgnoreCase(LastName));
        //Append two strings
        System.out.println(FirstName.concat(LastName));
        //string contains given string or not
        System.out.println(FirstName.contains("a"));
        //endsWith return is it end with particular string or not?
        System.out.println(FirstName.endsWith("n"));
        //equals return true if both string are equals else false.
        System.out.println(FirstName.equals("madan"));
        //return index of character if not return -1
        System.out.println(FirstName.indexOf("d"));
        //check string if empty return true else false
        System.out.println(FirstName.isEmpty());
        //return last index of string
        System.out.println(FirstName.lastIndexOf("a"));
        //return length of the string
        System.out.println(FirstName.length());
        //replace character
        System.out.println(FirstName.replace("a","b"));
        //replace first occurance
        System.out.println(FirstName.replaceFirst("a","b"));
        //replace All occurances
        System.out.println(FirstName.replaceAll("a","b"));
        //split string 
        String[] str = FirstName.split("d");              //split("d",2); split before 2 index...
        for(String a : str)
        {
            System.out.println(a);
            
        }
        //start with particular character
        System.out.println(FirstName.startsWith("M"));
        //return sub sequence from 0 to 2-1 index
        System.out.println(FirstName.subSequence(0, 2));
        //return subString after particular index
        System.out.println(FirstName.substring(2));
        //convert string into lower case
        System.out.println(FirstName.toLowerCase());
        //convert string into upper case
        System.out.println(FirstName.toUpperCase());
        //trim removes whitespace from both ends of string
        System.out.println(FirstName.trim());
        //String.valueOf(anyValue) converts value into string
        int a = 12;
        System.out.println(String.valueOf(a));
    }
}