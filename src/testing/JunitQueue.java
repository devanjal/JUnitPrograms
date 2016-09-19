package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitQueue {

	@Test
	public void test() {
		int inputArray[] = {10,20,30,40};
		int outputArray[] = new int[4];
		
		QueueEx q = new QueueEx();
		Object result[]=q.queue(inputArray);
		
		for(int i=0;i<result.length;i++)
			outputArray[i]=(int) result[i];
		
		assertArrayEquals(inputArray,outputArray);
	}
	

}