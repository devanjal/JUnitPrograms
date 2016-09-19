package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitHashMapCollection {


		@Test
		public void test() {
		
			
			HashMapCollection q = new HashMapCollection();
			String result=q.hash("Coder");
			assertEquals("Devanjal Kotia",result);
			
		}}