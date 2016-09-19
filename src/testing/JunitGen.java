package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitGen {

	@Test
	public void test() {
		Generic g = new Generic();
		String y[]={"yhgu","sfdd","fsf"};
		
		Object[] result = g.array(3,y).toArray();
		String expectedOutput[]={"yhgu","sfdd","fsf"};
		assertArrayEquals(expectedOutput,result);
	}

}
