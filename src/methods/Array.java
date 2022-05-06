package methods;

public class Array {
   public static void main(String[] args) {
	
//	  int [] i = new int [0]; // we can use zero value but it can't exicute
//	   int j = i.length;
//	   System.out.println(i[0]);
	   
//	   int [] m = new int [-3];// get ArrayIndexOutOfBoundsException , negative value not accepted
//	    m [-0] = 21;
//	    m [-1] = 20;
//	    m [-2] = 31;
//	    int k = m.length;
//	    System.out.println(m[-1]);
	   
//	   int [] a = new int [3];
//	   a [0] = 10;
//	   a [1] = 20;
//	   a [2] = 30;
//	  // a [3] = 40;// we get exception ArrayIndexOutOfBoundsException bcz we fixd value 3 index from 0
//	   
//	   int b = a.length;
//	   System.out.println(a[1]);// get value which we put in array [].

	   
	   int [] a = {10,20,30,40}; 
	   
	   for (int i=0;i<a.length;i++) // ANS:10203040
	   {
		   System.out.print(a[i]); 
	   }
	   
//	   for (int i:a) // getting all values // 10,20,30,40,
//	   {
//		   System.out.print(i+ " , ");
//	   }
	   
	   
}
}








































































