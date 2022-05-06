package polymorphism;

public class run_parent {

	public void test1() {
		System.out.println("public in parent");
	}
	void test2(int a) {
		System.out.println("default in parent");
	}
	protected void test3(String a) {
		System.out.println(" protected in parent");
	}
	private void test4() {
		System.out.println("private in parent");
	}
	static void test5(byte m) {
		System.out.println("static in parent");
	}
}
