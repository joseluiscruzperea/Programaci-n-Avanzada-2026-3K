package Practice2_JavaArrays;

public class Practice2_5 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; 
        
        // 5. Calculate and display the mean (average) of an array
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        double mean = sum / array.length;
        System.out.println("Mean: " + mean);
    }
}