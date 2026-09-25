package Practice2_JavaLoops;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nLoop 2:"); 
		int a = 25; 
		while(a < 50) 
		{ 
		 a++; 
		 if(a % 3 == 0) 
		  continue; 
		 System.out.println("Oh my!"); 
		} 
		System.out.println(a);
	}

}
