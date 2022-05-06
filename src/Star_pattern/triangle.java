package Star_pattern;

public class triangle {

	public static void main(String[] args) {
		for(int a=1;a<=6;a++) {
			for(int b=5;b>=a;b--)
			{
			System.out.print(" ");	
			}
			for(int m=1;m<=a;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=6;i<=1;i--) {
		for(int j=1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		  System.out.println();
		}
	}
	
}
