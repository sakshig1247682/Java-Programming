public class while4 {
        public static void main(String[] args) {
            int number = 12345;
            int sum = 0;
    
            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                sum += digit; // Add the last digit to the sum
                number /= 10; // Remove the last digit from the number
            }
    
            System.out.println("Sum of digits: " + sum);
        }
    }
    
