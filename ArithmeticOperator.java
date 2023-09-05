import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the first number: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double d2 = sc.nextDouble();
        double sum = d1+d2;
        double difference = d1-d2;
        double product = d1*d2; 
        double division = d1/d2;
        System.out.println("The sum is: " +sum);
        System.out.println("The subtraction is: " +difference);
        System.out.println("The multiplication is: " +product);
        System.out.println("The division is: " +division);
    }
    
}
