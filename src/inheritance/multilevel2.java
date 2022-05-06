package inheritance;

public class multilevel2 extends parent2 {

	public void test1() {
		System.out.println("i m in multichild extends from parent2");
	}
	public static void main(String[] args) {
		 multilevel2 obj = new  multilevel2();
		 obj.test1();
		 obj.test2();
	}
}
