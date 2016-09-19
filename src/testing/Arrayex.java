//Store 5 elemenst in an array in the multiple of 5	
package testing;
import java.util.Scanner;
public class Arrayex {
	
		public int element(int n){  
			
		int c=10;
		int a[]=new int[5];
		
		for(int i=0;i<5;i++){
			
			a[i]=c;
			c=c+5;
		}
		
		return a[n];
		}  
}
