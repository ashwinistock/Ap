package logic;

public class divisible_num {

	public static void main(String[] args) { 
		
		int a = 15;          // if reminder is 0 it's divisible
		if(a % 5 == 0) {
			System.out.println(" divisible by 5");
		}
		else {
			System.out.println("not divisible by 5");
		}
		 int b = 22;
		 if( b % 11 == 0) {
			 System.out.println("given num is divisible by 11");
		 }
		 else {
			 System.out.println("given num is not divisible by 11");
		 }
	    }
}
