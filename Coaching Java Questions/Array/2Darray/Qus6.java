//Create an 2Darray  of 3*3 and find the sum of the diagonal
public class Qus6 {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
           int diagonalSum = 0;
    
            for (int i = 0; i < array.length; i++) {
                diagonalSum += array[i][i];
            }
    
            System.out.println("The sum of the diagonal elements is: " + diagonalSum);
        }
    }
    

