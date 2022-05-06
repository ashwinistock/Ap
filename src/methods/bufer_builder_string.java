package methods;

public class bufer_builder_string {

	public static void main(String[] args) {
		
	
	// normal String imutable
	String name = "imutable ";
	name.concat(" yes");
	System.out.println(name);
	
	// StringBuilder it's class we make obj n it's mutable
	StringBuilder buildname = new StringBuilder ("mutable");
	buildname.append(" yes");//append method of stringBuilder
	System.out.println(buildname);
	
	StringBuffer buffername = new StringBuffer ("Mutable");
	buffername.append(" yes");// append method of stringbuffer
	System.out.println(buffername);
	
}
}