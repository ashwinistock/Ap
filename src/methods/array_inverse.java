package methods;

public class array_inverse {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60};// intialize array
		System.out.print("original arary");
		
		for(int b=0;b<a.length;b++) { // for getting original value
			System.out.print(a[b]+" ");
		}
		
		System.out.println();
		System.out.println("array in reverse order;");
		
		for (int i=a.length-1;i>=0;i--) //loop for reverse order array 
		{
			System.out.print(a[i]+" ");
			
		}
	}
}














































































