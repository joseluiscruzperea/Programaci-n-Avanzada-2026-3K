package Practice4_JavaArrays;

public class Practice4_6 {
    public static void main(String[] args) {
        // 6. Trace the following code. Output expected:
        // 231
        // 221
        // 023
        // 104
        int array6[][] = {{2,3,1},{2,2,1},{0,2,3},{1,0,4}}; 
        
        for(int i=0;i<4;i++) { 
            for(int j=0;j<3;j++)      
                System.out.print(array6[i][j]); 
            System.out.println(); 
        }
    }
}