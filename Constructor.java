public class Constructor {

    String s;
    float f;

    Constructor() {
        System.out.println("This is a default constructor");
    }

    Constructor(String s1, float f1) {
        s = s1;
        f = f1;
        System.out.println("The value of s is " + s);
        System.out.println("The value of f is " + f);
    }

    Constructor(Constructor C) {
        s = C.s;
        f = C.f;

        System.out.println("This is copy constructor");
    }

    void display() {
        System.out.println(s + " " + f);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.display();
        Constructor c2 = new Constructor("rahul", 19.5f); 
        c2.display();
        Constructor c3 = new Constructor(c2);
        c3.display();
    }
}
