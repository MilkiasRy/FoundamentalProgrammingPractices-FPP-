package mypackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestWelcome extends TestCase{

	@Test
	public void test() {
		//fail("Not yet implemented");
		String result= Welcome2.welcome();
		assertEquals("Welcome",result);
	}

}
