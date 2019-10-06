import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog6Test {

	@Test
	void test() {
		String[]arr={"horse","dog","cat","horse","dog"};
		String[] result1= Prog6.removeDups(arr);
		String[] expectedValue={"horse","dog","cat"};
		for (int i=0;i<result1.length;i++){
			assertEquals(result1[i],expectedValue[i]);
	}

}
}