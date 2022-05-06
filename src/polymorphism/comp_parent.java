package polymorphism;

public class comp_parent {

	public void test1(int a, int b) {
		a = 10;
		b = 20;
	  int	c = a+b;
		System.out.println(c);
	}
	void test2() {
		System.out.println("default");
	}
	public void test1() {
		System.out.println("polymorphism");
	}
	public void test1(String a) {
		System.out.println("ok");
	}
	public static void main(String[] args) {
		comp_parent obj = new comp_parent();
		obj.test1();
		obj.test1(" hey ashwini");
		obj.test1(10, 20);
		obj.test2();
	}
}
