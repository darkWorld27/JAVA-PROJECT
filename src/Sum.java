import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ENTER THE 1st DIGIT (or enter -1 to exit):");
            int a = sc.nextInt();

            if (a == -1) {
                break; // Exit the loop if -1 is entered
            }

            System.out.println("ENTER THE 2nd DIGIT:");
            int b = sc.nextInt();

            int sum = a + b;

            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}