package logic;

public class pascal1 {

//	public static void main(String[] args) 
//	{
//		for (int i=1; i<=5; i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) {
		for(int i=1;i<=6;i++ )
		{
			for(int k=6;k>=i;k--)
			{
				System.out.print(' ');
			
			}
				int m=1;
			for(int j=1;j<=i;j++)
			{
			System.out.print(j +" ");
			m=m*(j-i)/i;
			}
			System.out.println();
		}
		
		
		}
	
}
