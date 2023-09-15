public class StringInternExample {
    public static void main(String[] args) {
        // it will store in the string pool
        String str1= "Python";
        String str2 = "Data Science";
        String str3 = "Python";
        String str4 = "C";
        String str5 = new String("java");
        String str6 = new String("C++");
        String str7 = new String("Data Science");
        String str8 = new String("C").intern();

        System.out.println(str1 == str5);
        System.out.println(str2 == str6);
        System.out.println(str3 == str7);
        System.out.println(str4 == str8);
        
    }
    
}
