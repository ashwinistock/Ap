package homework;

import java.util.Arrays;
import java.util.Scanner;

public class maximum_charinString {

	public static void main(String[] args) {
		Scanner a =new Scanner (System.in);
		System.out.println("enter the string");
		String k = a.nextLine();
		
		char tempArray[] = k.toCharArray();
		Arrays.sort(tempArray);
		String s = new String (tempArray);
		int n = s.length();
		int m = 0;
		int c = 1;
		char ans ='-';
		for(int i=1;i<=n;i++) 
		{
			if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
           {
				if (m<c) {
					ans = s.charAt(i - 1);
				}
				c = 1;
			}
           else {
        	   c++;
           }
		}
		System.out.println("maximum occuring charecter is " +ans);
		
	}
}