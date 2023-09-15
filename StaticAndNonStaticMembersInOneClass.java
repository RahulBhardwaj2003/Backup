class Demo {
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("Control in ststic block");
        a=10;
        b=20;
    }

    {
        System.out.println("Control in non-static block");
        m=30;
        n=40;
    }

    static void disp1() {
        System.out.println("Value of static var a: " +a);
        System.out.println("Value of static var b: " +b);
    }

    void disp2() {
        System.out.println("Value of non-static var m: " +m);
        System.out.println("Value of non-static var n: " +n);
    }
}

public class StaticAndNonStaticMembersInOneClass {
    public static void main(String[] args) {
        
    
    Demo d = new Demo();
    Demo.disp1();


    d.disp2();

    }
    
}
