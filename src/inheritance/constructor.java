package inheritance;

public class constructor {

	int a ;
	String b;
	byte c;
	
	constructor() 
	 {
	c = 29;	 
	a =20;
	b = "hello";
	}
	constructor(int m,int n)
	 {
		 a = 11;
		 b = "ok";
		 c = 4;
	 }
	 
	 public static void main(String[] args) {
		 constructor obj = new constructor();
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		 System.out.println(obj.c);
		 
		 constructor obj1 = new constructor(10,2);
		 System.out.println(obj1.a);
		 System.out.println(obj1.b);
		 System.out.println(obj1.c);
		 
	}
}
