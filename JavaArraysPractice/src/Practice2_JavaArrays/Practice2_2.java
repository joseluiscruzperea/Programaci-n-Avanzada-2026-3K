package Practice2_JavaArrays;

public class Practice2_2 {
    public static void main(String[] args) {
        // 2. Declare an integer array fib with 5 numbers and initialize to the first 5 Fibonacci numbers
        int[] fib = {0, 1, 1, 2, 3}; 
        
        System.out.print("Arreglo Fibonacci: ");
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}