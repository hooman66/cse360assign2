/**
 * @author Hooman Abbasi
 * CSE360-70641
 * Assignment 2
 * This program adds/subtracts given values and returns the total 
 */


package cse360assign2;

/**
 * This class adds/subtracts given values
 * @param history keeps track of tranaction's history 
 * @param total  is the total value after all transactions
 */
public class AddingMachine {
	
	private int total;
	private String history = "0";
	
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * 
	 * @return total value 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * @param value will be added to the total value
	 */
	public void add (int value) {
		
		total = value + total;
		history = history + " + " + value;
		
	}
	
	
	/**
	 * 
	 * @param value will be subtracted from total value
	 */
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value;
	}
		
	/**
	 * @param retrun's history of transactions
	 */
	public String toString () {
		return history;
	}

	public void clear() {
	
	}	

}
