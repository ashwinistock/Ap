package Star_pattern;

public class febonassi {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=10;
		
		System.out.println("febonacci series"+c);
		
		for(int i=1;i<=c;i++) // 
		{
			System.out.print(a+", ");
			
			int m = a+b;
			a=b;
			b=m;
		}
		
	 }
	}

