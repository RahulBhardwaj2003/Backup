public class LogicalANDoperator {
    public static void main(String[] args) {
        int a=20, b=50, c=10;
        System.out.println("var a= " +a);
        System.out.println("var b= " +b);
        System.out.println("var c= " +c);
        if ((a<b) && (b<c)) {
            int d = a+b+c;
            System.out.println("The sum is: " +d);
        } else {
            System.out.println("False condition");
        }

    }
}
