package arrays;

import java.util.Arrays;

public class ArrayMethod {
    static void printMultipliedArray(int multiplier,int[] numbers){
        multiplier++;
        for ( int i= 0;i<numbers.length;i++){
            numbers[i] *= multiplier;
            System.out.print(numbers[i]+" ,");
        }
        System.out.println("\b");
    }
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 2, 10, 11, 10};
        int multiplier = 2;
        for (int number : numbers) {
            System.out.print(number + " ,");
        }
        System.out.print("\b");
        System.out.println();
        System.out.println("The array values are different because before executing the method,\n" +
                "the original values are preserved, but after executing the method,\n" +
                "the array values will change because the array is of the reference type,\n" +
                "as the index for for each value points to an address in memory,\n" +
                "and at this address the values are stored, and when any modification is made,\n" +
                "it will permanently change the values.\n" +
                "In other words, when we pass an array to a function, it passes a reference to that array,\n" +
                "and therefore any change made to the elements of the array will affect the original array.");
        printMultipliedArray(multiplier, numbers);
        for (int number : numbers) {
            System.out.print(number + " ,");
        }
        System.out.print("\b");
        System.out.println();
        System.out.println(multiplier+"\nBecause integers are of the Primitive type\n" +
                "when the function is applied to this number\n" +
                "it will create a copy of that value and pass it to the function\n" +
                "and the original value will remain unchanged." );

    }
}
