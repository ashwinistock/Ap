package logic;

public class armstrong {

	public static void main(String[] args) {
		int num = 371;
		int rem;
		int cube = 0;
		int temp = num;
		while(num > 0) 
		{
			rem = num %10;
			cube = cube+(rem*rem*rem);
			num = num/10;
		}
		if ( temp == cube)
		{
			System.out.println("num is armstrong");
		}
		else {
			System.out.println("num not armstrong");
		}
	}
}
