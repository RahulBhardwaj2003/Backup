public class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = {
            { 2, 0, 4, 6, 9 },
            { 9, 8, 0 },
            { 4, 6, 7, 7, 5, 1, 10 }
    };

    for (int i = 0; i <= 2; i++) {
        for (int j = 0; j < nums[i].length; j++) {
            System.out.print(nums[i][j] + " ");
        }
        System.out.println();
    }
    }
}




