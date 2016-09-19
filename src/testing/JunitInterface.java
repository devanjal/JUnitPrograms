package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitInterface {

	@Test
	public void test() {
		DogType d=new DogType();
		String result=d.inter();
		String dog="Labrador";
		assertEquals(dog,result);
	}}


