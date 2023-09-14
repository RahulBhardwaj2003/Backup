public class Hybrid {
    public static void main(String[] args) {
        rahul r1 = new rahul();
        r1.printrahul();
        r1.student1();

        rohit r2 = new rohit();
        r2.printrohit();
        r2.printstudent1();     
    }
}
    class student {
        void student1() {
            System.out.println("studying");
        }
    }

    class boy extends student {
        void student1() {
            System.out.println("playing");
        }
    }
    class rahul extends boy {
        void printrahul() {
            System.out.println("learning");
        }
    }

    class boy1 extends student {
        void printstudent1() {
            System.out.println("Physics student");
        }
    }
    class rohit extends boy1 {
        void printrohit() {
            System.out.println("exam");
        }
    }

   

