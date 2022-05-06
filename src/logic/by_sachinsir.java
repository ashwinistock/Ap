package logic;

public class by_sachinsir {

	public static void main(String[] args) {
		int a = 4;
		for (int b = 1; b <=6;b++) {
			int c = 1;
			for (int i =1;i <=b;i++) {
				System.out.print(c +  "  ");
				
				c = c* (b -i) / i;
			}
			System.out.println( );
		}
	}
}
