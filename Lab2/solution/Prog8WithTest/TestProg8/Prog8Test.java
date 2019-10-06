import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog8Test {

	@Test
	void test() {
		 
			int[] testArray={2,-21,3,45,0,12,18,6,3,1,0,-22};
			int testValue= Prog8.min(testArray);
		    assertEquals(testValue,-22);
		}
	}


