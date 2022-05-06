package methods;

public class method_strings {

	String A = "Ashwini pawar";
	
	public static void main(String[] args) {
		method_strings obj = new method_strings();
		System.out.println(obj.A);            // normal given value
		System.out.println(obj.A.charAt(6)); // chartAt give us index no.of word which we take
		System.out.println(obj.A.concat("miss")); // concat add what we want
		System.out.println(obj.A.length()); // it will say the length of our given value
		System.out.println(obj.A.toLowerCase()); // it will return in all small laters
		System.out.println(obj.A.toUpperCase()); // it will return in all capital later
		System.out.println(obj.A.equals(obj)); //equal give boolean value
		System.out.println(obj.A.equalsIgnoreCase("Ashwini pawar"));  // it will compaire n boolen value will return
	}
}
