package Practice4_JavaArrays;

public class Practice4_5 {
    public static void main(String[] args) {
        int[][] array = new int[16][32];
        
        // 5. Loop that will print every value in a 16 by 32 element array to the screen
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}