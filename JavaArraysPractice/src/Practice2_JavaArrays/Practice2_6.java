package Practice2_JavaArrays;

import java.util.Arrays;

public class Practice2_6 {
    public static void main(String[] args) {
        int[] array = {15, 22, 9, 11, 7, 43, 10, 3}; 
        
        // 6. Find and display the median (middle number) of an array
        Arrays.sort(array); 
        
        double median;
        int n = array.length;
        
        if (n % 2 == 0) {
            median = (array[n / 2] + array[(n / 2) - 1]) / 2.0;
        } else {
            median = array[n / 2];
        }
        
        System.out.println("Median: " + median);
    }
}