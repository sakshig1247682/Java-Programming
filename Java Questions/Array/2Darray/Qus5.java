//create an 2D array of 3*3 and find the largest row in that 2D array and print their sum

public class Qus5 {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            int largestSum = Integer.MIN_VALUE;
            int largestRowIndex = -1;
            for (int i = 0; i < array.length; i++) {
                int currentRowSum = 0;
                for (int j = 0; j < array[i].length; j++) {
                    currentRowSum += array[i][j];
                }
                if (currentRowSum > largestSum) {
                    largestSum = currentRowSum;
                    largestRowIndex = i;
                }
            }
    
            System.out.println("The largest row sum is: " + largestSum);
        }
    }
    