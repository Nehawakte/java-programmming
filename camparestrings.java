// Java program to Compare two strings
// lexicographically
public class Compare {
    public static void main(String args[])
    {
        String string1 = new String("Mountain");
        String string2 = new String("River");
        String string3 = new String("trees");
        String string4 = new String("trees");
        String string5 = new String("Trees");

        // Comparing for String 1 != String 2
        System.out.println("Comparing " + string1 + " and "
                           + string2 + " : "
                           + string1.equals(string2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and "
                           + string4 + " : "
                           + string3.equals(string4));

        // Comparing for String 4 != String 5
        System.out.println("Comparing " + string4 + " and "
                           + string5 + " : "
                           + string4.equals(string5));

        // Comparing for String 1 != String 4
        System.out.println("Comparing " + string1 + " and "
                           + string4 + " : "
                           + string1.equals(string4));
    }
}
