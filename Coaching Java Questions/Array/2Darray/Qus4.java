//create a 2D array of 2*3 and find the sum  of the first row and first column together in java

public class Qus4 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Find the sum of the first row
        int sumFirstRow = 0;
        for (int i = 0; i < array[0].length; i++) {
            sumFirstRow += array[0][i];
        }

        // Find the sum of the first column
        int sumFirstColumn = 0;
        for (int i = 0; i < array.length; i++) {
            sumFirstColumn += array[i][0];
        }

        // Combine the sums, but subtract the shared element array[0][0] once
        int totalSum = sumFirstRow + sumFirstColumn - array[0][0];

        // Print the result
        System.out.println("Sum of the first row and first column together: " + totalSum);
    }
}
