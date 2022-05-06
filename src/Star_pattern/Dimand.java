package Star_pattern;

public class Dimand {

	public static void main(String[] args) {
		for(int a=1;a<=6;a++) 
		{
			for(int b=5;b>=a;b--) 
			{
				System.out.print(" ");// for gap bet consol line and *
			}
			for(int c=1;c<=a;c++) 
			{
				
		System.out.print(" *");
		}
		System.out.println();
	}
		for(int a=6;a>=1;a--)
		{
			for(int b=5;b>=a;b--) 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				
		System.out.print("*");
		}
		System.out.println();
	}
		
	}
}
