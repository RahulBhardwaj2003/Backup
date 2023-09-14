import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int a = sc.nextInt();
        int[] array1 = new int[a];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements you want to store: ");
        int b = sc.nextInt();
        int[] array2 = new int[b];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < b; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements you want to store: ");
        int c = sc.nextInt();
        int[] array3 = new int[c];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < c; i++) {
            array3[i] = sc.nextInt();
        }

        int nums[][] = {array1, array2, array3};
        for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j < nums[i].length; j++) {
                        System.out.print(nums[i][j] + " ");
                    }
                    System.out.println();
                }
    
    }
}