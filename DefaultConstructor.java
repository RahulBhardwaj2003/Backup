public class DefaultConstructor {
    String s;
    float age;

    DefaultConstructor() {
        System.out.println("This is a Default Constructor");
    }

    void display() {
        System.out.println("Name: " +s);
        System.out.println("Age: " +age);

    }

    public static void main(String[] args) {
        DefaultConstructor D = new DefaultConstructor();
        D.display();
    }
}
