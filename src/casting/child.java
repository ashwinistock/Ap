package casting;

public class child extends parent {

	public void test1(int a) {
		a = 20;
		System.out.println("public in child");
	}
	void test2(String b) {
		b = "Ashwini";
		System.out.println("defauld in child");
	}
	protected void test3(byte c) {
		c = 4;
		System.out.println("protected in child");
	}
	private void test4(char d) {
		d = 'A';
		System.out.println("private in child");
	}
	static void test5(double e) {
		e = 10101010;
		System.out.println("static in child");
	}
	
	public static void main(String[] args) {
		parent obj = new child() ;
		
		obj.test1(9);
		obj.test2("Ashwini");
		//obj.test3(1); we can't call protected 
	//	obj.test4(); we can't call private
		obj.test5(10);
		}
}
