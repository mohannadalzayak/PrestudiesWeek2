package data_types;

public class Comparing {
    public static void main(String[] args) {
        String str1 = "Comparison";
        String str = new String("Comparison");

        System.out.println("equals compares contents of two strings , if they have the same sequence of characters or not : "+str.equals(str1));
        System.out.println();
        System.out.println("Comparing using == will compare the pointer to the reference in memory for both: "+(str == str1));
        System.out.println();
        System.out.println("When a string is defined using a string literal, Java checks the string constant pool.\n" +
          "If the string already exists, returns a reference\n" +
          "to the existing string object. If it does not exist, creates a new String object in the pool\n" +
          "and returns its reference.\n" +
          "Creating a string using the new keyword creates\n" +
          "a new string object in the heap memory, regardless of\n" +
          "whether it exists in the string constant pool.");


//        System.out.println(System.identityHashCode(str));
//        System.out.println(System.identityHashCode(str1));

    }

}
