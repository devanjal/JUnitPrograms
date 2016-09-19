package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitArray {

	@Test
	public void test() {
		Arrayex q = new Arrayex();
		int result=q.element(2);
		assertEquals(20,result);
	}

}
