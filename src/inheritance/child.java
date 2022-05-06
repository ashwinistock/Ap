package inheritance;

public class child extends parent{  // single level inheritance

	int a = 20; 
	String b ="ashu";
	
	public void add() {
		System.out.println("i m from parent");
	}
	public static void main(String[] args) {
		child obj = new child();
		obj.add();
		obj.add(10, 20);
		System.out.println(obj.b);
		System.out.println(obj.a);
	}
}
