import java.util.Scanner;
public class TwoDimensionalArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

       int array[][] = new int[r][c];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
            System.out.println("Elements of the array are: ");
            for(int i=0; i<r; i++) {
                for(int j=0; j<c; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }