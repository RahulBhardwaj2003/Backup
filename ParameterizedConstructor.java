public class ParameterizedConstructor {
    String name;
    float age;
    ParameterizedConstructor(String s, float f) {
        name = s;
        age = f;

        }
         void display() {
            System.out.println("Name: " +name);
            System.out.println("Age: " +age);
    }
    public static void main(String[] args) {
        ParameterizedConstructor P = new ParameterizedConstructor("rahul", 20);
        P.display();
    }
}
