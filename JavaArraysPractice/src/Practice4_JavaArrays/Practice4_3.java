package Practice4_JavaArrays;

public class Practice4_3 {
    public static void main(String[] args) {
        int[] num = new int[20];
        
        // 3. Loop through an integer array called num of size 20, initialize all elements to double their index value
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
        }
    }
}