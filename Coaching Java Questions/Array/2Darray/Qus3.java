//Create a 2D array of 2*2 in that array we find the sum of the first row and first column
public class Qus3 {
    
    public static void main(String[] args) {
        int[][] array = {
            {1, 2},
            {3, 4}
        };

        // Find the sum of the first row
        int sumFirstRow = array[0][0] + array[0][1];

        // Find the sum of the first column
        int sumFirstColumn = array[0][0] + array[1][0];

        // Print the results
        System.out.println("Sum of the first row: " + sumFirstRow);
        System.out.println("Sum of the first column: " + sumFirstColumn);
    }
}