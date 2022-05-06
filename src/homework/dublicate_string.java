package homework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class dublicate_string {

	public static void main(String[] args) {
		 String input = "I am am ashwini ashwini";
		  
		 String [] inputArr = input.split(" ");  // split help to seprate dublicate
		 
		 Set<String> mySet=new LinkedHashSet<String>();// dublicate collection seprate
		 
		 for (String x:inputArr) {
			 mySet.add(x);  
		 }
				 Iterator itr =mySet.iterator();
				 while(itr.hasNext()) {
					 System.out.print(itr.next()+" ");
	 			 }
	}
	}

