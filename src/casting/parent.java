package casting;

public class parent {

	public void test1(int a) {
		System.out.println("public in parent");
	}
	void test2(String b) {
		System.out.println("default in parent");
	}
	protected void test3(byte c) {
		System.out.println("protected in parent");
	}
	private void test4(char d) {
		System.out.println("private in parent");
	}
	static void test5(double e) {
		System.out.println("static in parent");
	}
}
