package arrays;

public class BasicSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, -22, 300, 43, 0};
        int sum = 0;

        int max = numbers[0];
        int min=numbers[0];
        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("the sum of array is "+sum);
        System.out.println("The largest number is:"+max);
        System.out.println("The smallest number is :"+min);
    }
}
