package methods;

import java.util.Scanner;

public class Strin_Eg {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.err.println("name");
		String a = obj.nextLine();
		
		//String a = ; //print the given stat
		
		int len = a.length();  // count the length of word
		
		String m="";           // for store value 
		
		for( int b =len-1;b>=0;b--)    //len-1 = we want index values from zero,length count  
		{
			m = m + a.charAt(b);  // last value take 
			
			System.out.print(a.charAt(b));
		}
		
//		
//			public static void main(String [] args)
//			{
//				String a="Riya";
//				int len= a.length();
//				String b="";
//			     
//				for(int c=len-1;c>=0;c--)
//			    {
//					b=b+a.charAt(c);
//			    	System.out.println(a.charAt(c));
//			    }
			}
	}

