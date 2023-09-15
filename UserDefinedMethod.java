import java.util.Scanner;

public class UserDefinedMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        findEvenOdd(num);
        sc.close();
    }

    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
