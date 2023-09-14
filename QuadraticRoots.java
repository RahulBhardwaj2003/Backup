import java.util.Scanner;

public class QuadraticRoots {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three coefficients");
        double a, b, c, d;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = b * b - (4 * a * c);
        if (d > 0) {
            double b1, b2;
            b1 = -b + Math.sqrt(d) / (2 * a);
            b2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("First Root is " + b1);
            System.out.println("Second root is " + b2);

        } else if (d == 0) {
            System.out.println("Root of the equation is " + -b / 2 * a);
        } else {
            System.out.println("Roots are " + -b / (2 * a) + "+i" + Math.sqrt(-d) / (2 * a) + " and " + -b / (2 * a)
                    + "-i" + Math.sqrt(-d) / (2 * a));
        }

    }
}
