package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @Author: Jack Summers <br>
 * @StudentID: 1212723250 <br>
 * @Assignment: 2 <br>
 * @Description: Tests the AddingMachine class.
 */
class AddingMachineTest {

	/**
	 * Test 1. Tests add & subtract.
	 */
	@Test
	void test1() {
		AddingMachine test1 = new AddingMachine();
		test1.add(5);
		test1.subtract(3);
		boolean pass = ((test1.toString().equals("0 + 5 - 3")) && (test1.getTotal() == 2));
		System.out.println(test1.toString());
		System.out.println(test1.getTotal());
		assertTrue(pass);
	}
	
	/**
	 * Test 2. Tests for negative results.
	 */
	@Test
	void test2() {
		AddingMachine test2 = new AddingMachine();
		test2.subtract(3);
		boolean pass = (test2.toString().equals("0 - 3") && test2.getTotal() == -3);
		assertTrue(pass);
	}

}
