public class LogicalORoperator {
    public static void main(String[] args) {
        int a = 80, b = 50, c = 50, d = 85;
        System.out.println("var a= " +a);
        System.out.println("var b= " +b);
        System.out.println("var c= " +c);
        System.out.println("var d= " +d);
        if (a<b || c<d) {
            System.out.println("One or both the conditions are true.");
        } else {
            System.out.println("Both the conditions are false.");
        }
    }
    
}
