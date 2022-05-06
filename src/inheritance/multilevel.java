package inheritance;

public class multilevel extends parent { // multilevel inheritance

	public void add() {
		System.out.println("i m public");
	}
	public void add1() {
		System.out.println("i am add1");
	}
	public static void main(String[] args) {
		multilevel obj = new multilevel();
		obj.add();
		obj.add(20, 30);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
