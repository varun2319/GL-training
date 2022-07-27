package gltesting;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {
	Demo2 d2=new Demo2();

	@Test
	void testPalindromeCheck() {
		//fail("Not yet implemented");
		assertTrue(d2.palindromeCheck("madam"));
		
	}

}