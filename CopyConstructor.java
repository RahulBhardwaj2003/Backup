public class CopyConstructor {
    String name;
    float age;
    CopyConstructor(String s, float f) {
        System.out.println("This is Parameterized Constructor");
        name = s;
        age = f;
        }
        CopyConstructor(CopyConstructor C) {
            System.out.println("This is Copy Constructor");
            name = C.name;
            age = C.age;
        }
         void display() {
            System.out.println("Name: " +name);
            System.out.println("Age: " +age);
    }
    public static void main(String[] args) {
        CopyConstructor C = new CopyConstructor("rahul", 20);
        C.display();
        CopyConstructor C1 = new CopyConstructor(C);
        C1.display();
    }
}
