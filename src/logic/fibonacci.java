package logic;

public class fibonacci {

 	public static void main(String[] args) {
		
 		int a = 10;
 		int b = 0;
 		int c = 1;
 		System.out.println("fibonacci series" +a); // febonasi print with a value
 		
 		for(int i=1;i<=a;++i)
 		{
 		System.out.print(b + ", ");	 // 0,1,
 	    int t1 = b + c; //0+1=1(t1)
 	     b = c;         // b=1
 	     c = t1;        // c = 1
 	 
 		}
	}
 }
