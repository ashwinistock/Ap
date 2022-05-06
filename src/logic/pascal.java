package logic;

public class pascal {

	public static void main(String[] args) {
		int n = 4;
		for(int line = 1; line <=4; line++) 
		{
			int c = 1;
		
		for(int i=1;i<=line;i++) 
		{
			
			System.out.print(c + " ");
			
			c = c* (line -i) ;
		}
			System.out.println();
		}
	}
}
