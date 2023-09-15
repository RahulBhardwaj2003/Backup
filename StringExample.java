public class StringExample {
    public static void main(String[] args) {
        String s1 = "java";   //creating string by java string literal
        char ch[] = {'r', 'a', 'h', 'u', 'l'};
        String s2 = new String(ch);   //converting char array to string
        String s3 = new String("chandigarh university");   //creating java string by new keyword

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
