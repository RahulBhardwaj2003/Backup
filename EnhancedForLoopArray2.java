public class EnhancedForLoopArray2 {
    public static void main(String[] args) {
        int nums[] [] = 
        {
            {5, 8, 6, 8},
            {2, 8, 5, 0},
            {8, 4, 7, 9}
        };
        for(int a[] : nums) {
            for(int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
