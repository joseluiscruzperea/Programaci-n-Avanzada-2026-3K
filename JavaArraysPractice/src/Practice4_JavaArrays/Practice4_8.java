package Practice4_JavaArrays;

public class Practice4_8 {
    public static void main(String[] args) {
        // 8. Trace the following code. Output expected: 1286864
        // (Note: The print statement has no spaces or newlines inside the loops)
        int array8[][] = {{6,4,3},{4,3,2}}; 
        
        for(int i=0;i<2;i++) 
            for(int j=0;j<3;j++)        
                System.out.print(2*array8[i][j]);
                
        System.out.println();
    }
}