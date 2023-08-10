import java.util.Scanner;
public class Reverse {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER THE THE WORD YOU WANT TO REVERSE OR TYPE exit TO QUIT");
            String original = sc.nextLine();
            if (original.equals("exit")) {
                break;
            }

            StringBuilder reversed = new StringBuilder(original).reverse();
            System.out.println("Original:" + original);
            System.out.println("Reversed:" + reversed);
        }
        sc.close();
    }
}
