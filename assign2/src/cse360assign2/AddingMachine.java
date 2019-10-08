package cse360assign2;

/**
 * @Author: Jack Summers <br>
 * @StudentID: 1212723250 <br>
 * @Assignment: 2 <br>
 * @Description: Adding machine class. Provides methods for adding & subtracting from a total value, returning the history
 * of operations as a string, and returning the total.
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to the total.
	 * @param int value
	 */
	public void add (int value) {
		total += value;
		history += " + " + Integer.toString(value);
	}
	
	/**
	 * Subtracts the value from the total
	 * @param int value
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + Integer.toString(value);
	}
		
	/**
	 * Returns the history of operations as a string, i.e. "0 + 2 - 3"
	 */
	public String toString () {
		return history;
	}

	/**
	 * Sets total to 0 and history to "0"
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
