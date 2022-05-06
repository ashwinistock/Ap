package logic;

public class leap_year {

	public static void main(String[] args) {
		int a = 2016;
		if (( a % 4 == 0) || (a % 400 == 0)) // 2016 % 4 = 00 its leap year // 2017 % 4 = 1 it's not bcz reminder is not zero
		{
		System.out.println("this is leap year");	
		}
		else
		{
		 System.out.println("this is not leap year");	
		}
	}
}
