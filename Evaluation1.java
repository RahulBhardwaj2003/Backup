import java.util.Scanner;
import java.util.ArrayList;

public class Evaluation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int stuCount = sc.nextInt();

        // Create an ArrayList to store student objects
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < stuCount; i++) {
            System.out.println("Enter the UID of student " + (i + 1) + ": ");
            int num = sc.nextInt();
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            String s = sc.next();
            System.out.println("Enter the section of student " + (i + 1) + ": ");
            String se = sc.next();

            // Create a new Student object and add it to the ArrayList
            Student student = new Student(num, s, se);
            students.add(student);
        }

        // Access and print the data of the 2nd student (index 1)
        if (students.size() >= 2) {
            Student secondStudent = students.get(1); // 2nd student is at index 1
            System.out.println("Data of the 2nd student:");
            System.out.println("UID: " + secondStudent.getUid());
            System.out.println("Name: " + secondStudent.getName());
            System.out.println("Section: " + secondStudent.getSection());
        } else {
            System.out.println("There is no 2nd student.");
        }
    }
}

class Student {
    private int uid;
    private String name;
    private String section;

    public Student(int uid, String name, String section) {
        this.uid = uid;
        this.name = name;
        this.section = section;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }
}
