import java.util.Scanner;
public class DisscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER THE AMOUT YOU SPENT ");
            double totalAmount = sc.nextDouble();
            if (totalAmount== -1){
                break; // Exit the loop if -1 is entered
            }
            double discountPercentage;
            if (totalAmount >= 100) {
                discountPercentage = 10;
            } else if (totalAmount >= 50) {
                discountPercentage = 5.0;
            } else {
                discountPercentage = 0.0;
            }

            double discountAmount = (totalAmount / 100) * discountPercentage;
            double finalAmount = totalAmount - discountAmount;

            System.out.println("TOTAL AMOUNT: $" + totalAmount);
            System.out.println("DISSCOUNT PERCENTAGE:" + discountPercentage + "%");
            System.out.println("DISSCOUNT AMOUNT:$" + discountAmount);
            System.out.println("FINAL AMOUNT:$" + finalAmount);
        }
        sc.close();

    }
}






