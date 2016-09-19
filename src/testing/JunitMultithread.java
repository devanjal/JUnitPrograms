package testing;
import static org.junit.Assert.*;

import org.junit.Test;

public class JunitMultithread {

	@Test
	public void test() 
	{
		 Thread th1 = new Thread ( new CheckThread("Rocket 1")); 
		 Thread th2 = new Thread ( new CheckThread("Rocket 2"));
		
		 CheckThread t = new CheckThread("Testing");
	     	th1.start();
	     	th2.start();
	     
	      assertEquals(t.count,0);
}
}
