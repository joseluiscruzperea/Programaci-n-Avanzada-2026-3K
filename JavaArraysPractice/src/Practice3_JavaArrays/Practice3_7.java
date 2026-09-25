package Practice3_JavaArrays;

public class Practice3_7 {
    public static void main(String[] args) {
        // 7. Trace the following code. Output expected: 0
        int array7[][] = {{2,2,2},{2,2,0}}; 
        
        for(int i=0;i<2;i++) 
            for(int j=0;j<3;j++)      
                if(array7[i][j]==0&&j==2) 
                    System.out.print(array7[i][j]); 
                    
        System.out.println(); 
    }
}