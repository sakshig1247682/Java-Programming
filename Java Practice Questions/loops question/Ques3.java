import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci sequence: ");
        int limit = scanner.nextInt();
        scanner.close();

        int previous = 0;
        int current = 1;
        System.out.println("Fibonacci sequence up to " + limit + ":");
        System.out.print(previous + " " + current + " ");

        for (int i = 2; i < limit; i++) {
            int next = previous + current;
            if (next > limit)
                break;
            System.out.print(next + " ");
            previous = current;
            current = next;
        }
    }
}


