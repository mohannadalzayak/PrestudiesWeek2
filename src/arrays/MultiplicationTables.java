package arrays;

public class MultiplicationTables {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int[][] table = new int[rows][cols];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j*i+"\t");
            }
            System.out.println();
        }
    }
}
