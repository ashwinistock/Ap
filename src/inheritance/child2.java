package inheritance;

public class child2 extends parent2 {

	public void test1() 
	{
		System.out.println("i am public in child2");
	}
	void test2() 
	{
		System.out.println("i m default in child2");
	}
	protected void test3() 
	{
		System.out.println("i m protected in child2");
	}
	private void test4() 
	{
		System.out.println(" i m private in child");
	}
	static void test5() {
		System.out.println("i m static in child2");
	}
	public static void main(String[] args) {
		child2 obj = new child2();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		parent2.test5();
		parent2 obj1 = new parent2();
		obj1.test1();
		obj1.test5();
		
	}
}
