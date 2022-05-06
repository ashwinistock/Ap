package homework;

public class remove_dublicate_char {

	public static void main(String[] args) {
		
		
		String a ="Ashwini";
		int length = a.length();
		char[] ch = a.toCharArray();
		
		for(int i=0; i < length; i++) 
		{
			for(int j=i+1; j<length; j++) 
			{
				if(ch[i]==ch[j]) 
				{
					System.out.println("duplicate char is:      "+ch[j]);
				}
				
			}
				
			
		  }
		}
}
