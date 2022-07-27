package gltesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testConcat() {
		//fail("Not yet implemented");
		Demo1 myConcat = new Demo1();
		String result = myConcat.stringconcat("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
