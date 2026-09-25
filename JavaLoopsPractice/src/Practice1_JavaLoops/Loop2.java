package Practice1_JavaLoops;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loop 2:"); 
		int x=15; 
		while(x<22) 
		{ 
		 x++; 
		 if(x % 2 == 0) 
		  continue; 
		 System.out.println("Bye!"); 
		} 
		System.out.println(x);
	}

}
