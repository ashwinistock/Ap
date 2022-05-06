package logic;

public class palledrom {

	public static void main(String[] args) {
		int num = 303;
		int rem;
		int sum = 0;
		int temp = num;
	
		while (num > 0)
		{	
			rem = num % 10;  // ave num 3 times
			sum = (sum*10)+rem;  // 3 times sum
			num = num / 10;      
		}
		if( temp == sum) {
			System.out.println("num is palledrome");
		}
		else {
			System.out.println("num not palledrome");
		}
	}
}
