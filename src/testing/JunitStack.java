package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitStack {

	@Test
	public void test() {
		Stack q= new Stack();
		long result=q.stacky();
		assertEquals(50,result);
	}

}
