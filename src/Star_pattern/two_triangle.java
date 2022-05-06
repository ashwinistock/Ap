package Star_pattern;

public class two_triangle {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) // for 1st clmn pritn 6 star
		{
			for (int b=5;b>=a;b--) // from second clmn print star 6,5,4,3,2,1
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int a=1;a<=6;a++) // for 1st clmn pritn 6 star
		{
			for (int b=1;b<=a;b++) // from second clmn print star 1,2,3,4,5,6
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}}

