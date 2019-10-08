package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @Author: Jack Summers <br>
 * @StudentID: 1212723250 <br>
 * @Assignment: 1 <br>
 * @Description: Tests the AddingMachine class.
 */
class AddingMachineTest {

	/**
	 * Test 1.
	 */
	@Test
	void test1() {
		AddingMachine test1 = new AddingMachine();
		test1.add(5);
		test1.subtract(3);
		boolean pass = (test1.toString().equals("0 + 5 - 3") && test1.getTotal() == 2);
	}

}
