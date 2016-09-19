//Enter the designation and display the name.
package testing;


import java.util.*;
import java.util.Scanner;

public class HashMapCollection {

	static HashMap<String,String> h= new HashMap<>();
	static List<String> l=new LinkedList<String>();
	public String hash(String x) {
		// TODO Auto-generated method stub
		l.add("Manager");
		l.add("Tester");
		l.add("Designer");
		l.add("Coder");
		
		System.out.printf("There are following desingation in our organization : %s", l);
		System.out.println("\n");
		
		
			
		h.put(l.get(0),"Anshul Gupta");
		h.put(l.get(1),"Ankit Bakshi");
		h.put(l.get(2),"Harish Pareek");
		h.put(l.get(3),"Devanjal Kotia");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the designation of the person you want to know about");
		System.out.println(h.get(x));
		return h.get(x);
	}
	
	}
		

	
