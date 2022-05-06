package logic;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("inter number");
		int no = obj.nextInt();
		/*int f_no = 1;
		
		for (int i=1;i<=5;i++) 
		{
			f_no = f_no*i;
			System.out.println("factorial of" +i+" :" +f_no);
		}*/
		
		int fact=1;
		for(int i=1;i<=no;i++) { 
			fact = fact*i;
		}
		System.out.println("factoria; og " +no+ " is"+fact);
	}
}
