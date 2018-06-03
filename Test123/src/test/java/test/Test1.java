package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {
	
	@Test
	public void testAdd() {
		int a=2;
		int b=3;
		int c=a+b;
		assertEquals(5, c);
	}

}
