package Star_pattern;

public class bigto_small {

	public static void main(String[] args) {
		    for(int a=7;a>=3;a--) //
		{
			for(int b=6;b>=a;b--) 
		{
		System.out.print(" ");	
		}
			for(int c=1;c<=a;c++) 
	     {
		System.out.print("* ");
		}
		System.out.println();
		}
		
		
	}
}
