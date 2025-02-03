//Take an array as input from the user.Search for a given number x and print the index at which it occurs
import java.util.Scanner;
public class Qus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int x = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                System.out.println("Number " + x + " found at index " + i);
            }
            
        }
    }
}
