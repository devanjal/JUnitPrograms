package testing;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Generic {
	static List<String> l=new LinkedList<String>();
	public List<String> array(int n, String x[]) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//System.out.println("Enter a number: ");
		
		
	int a[]=new int[n];//declaration and instantiation  
	//System.out.println("Enter the elements in array");
	for(int i=0;i<x.length;i++){
		
		arr.add(x[i]);
						}
	//printing array  
	
	for(int i=0;i<a.length;i++){//length is the property of array  
		l.add(arr.get(i));
		String y= arr.get(i);
	
						}
	return l;
	}
	
}
