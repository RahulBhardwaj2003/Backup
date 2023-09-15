import java.util.Scanner;

class Farmer {
    private int principalAmount;
    private float timeDuration;
    private static float interestRate = 4.5f;

    public void inputLoanDetails() {
        Scanner scanner = new Scanner(System.in);

        // Input for principal amount
        while (true) {
            System.out.print("Enter the loan amount: ");
            if (scanner.hasNextInt()) {
                principalAmount = scanner.nextInt();
                break;
            } else {
                System.out.println("Please enter a valid integer for the loan amount.");
                scanner.next();  // Clear the invalid input
            }
        }

        // Input for time duration
        while (true) {
            System.out.print("Enter the time duration (in years): ");
            if (scanner.hasNextFloat()) {
                timeDuration = scanner.nextFloat();
                break;
            } else {
                System.out.println("Please enter a valid float for the time duration.");
                scanner.next();  // Clear the invalid input
            }
        }
    }

    public float computeSimpleInterest() {
        return (principalAmount * timeDuration * interestRate) / 100f;
    }
}

public class LoanSeeking2 {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();

        System.out.println("Details for Farmer 1:");
        farmer1.inputLoanDetails();
        float simpleInterest1 = farmer1.computeSimpleInterest();
        System.out.println("Simple Interest for Farmer 1: " + simpleInterest1);

        System.out.println("\nDetails for Farmer 2:");
        farmer2.inputLoanDetails();
        float simpleInterest2 = farmer2.computeSimpleInterest();
        System.out.println("Simple Interest for Farmer 2: " + simpleInterest2);
    }
}

