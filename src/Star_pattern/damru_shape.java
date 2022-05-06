package Star_pattern;

public class damru_shape {
 public static void main(String[] args) {  
	 for(int a=4;a>=1;a--) 
	 {
		for(int b=4;b>=a;b--) 
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++) {
			System.out.print("* ");	
		}
		System.out.println();
	 }
	 for(int a=2;a<=4;a++) 
	 {
		for(int b=4;b>=a;b--) 
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++) {
			System.out.print("* ");	
		}
		System.out.println();
	 } 
}
}
