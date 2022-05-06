package polymorphism;

public class run_child extends run_parent {

	public void test1() 
	{
		System.out.println(" public in child");
	}
	void test2(int a,int c) 
	{
		System.out.println("default in child");
	}
	protected void test3(int a, int b, int c) {
		a =10 ;
		b =10;
		c = 10;
		System.out.println("protected in child");
	}
	private void test4() {
		System.out.println("private in child");
	}
	static void test5(int k) {
		System.out.println("static in child");
	}
	 public static void main(String[] args) {
		 run_child obj = new run_child() ;
		 obj.test1();
		 obj.test2(10);
		 obj.test2(20, 70);
		 obj.test3("ashwini");
		 obj.test3(1, 1, 1);
		 obj.test4();
		 obj.test5(9);
		 obj.test5(1111111111);
			 
		 
	}
}
