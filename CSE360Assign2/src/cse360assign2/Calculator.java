 /* @author Andrew Coughlin, Class ID: 357
 * @version 3.0
 * @since 2019-02-22
 * 
 * The calculator program will create a calculator object that
 * allows the operations of addition, subtraction, multiplication,
 * and division to the total value of all of the previously done
 * operations. There is also a function to return the total and to
 * print out the history of all the operations done to the total.
 */


package cse360assign2;

public class Calculator {
	
	/*
	 * @param total		Integer variable that all of the operations are performed on.
	 * total will be the number that is always added to or subtracted from, for example.
	 * 
	 * @param history	String that will be used to keep track of all the operations
	 * performed on the total. Each operation will add what they did to the history.
	 */
	
	private int total;
	private String history;
	
	/*
	 * Default constructor for the Calculator object. It takes no parameters and
	 * initializes the total to 0. It also initializes the history of the calculator
	 * to the string "0".
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/*
	 * This method will return the final result of all the operations done
	 * so far. For example, after adding 5 to 0, the method will return 5.
	 */
	
	public int getTotal () {
		return total;
	}
	
	/*
	 * @param value		Integer to be added to the total.
	 * Takes parameter "value" and will add it to the variable total.
	 * Adds to the calculator history.
	 */
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/*
	 * @param value		Integer to be subtracted from the total.
	 * Takes parameter "value" and will subtract it from the variable total.
	 * Adds to the calculator history.
	 */
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/*
	 * @param value		Integer that the total will be multiplied by.
	 * Takes parameter "value" and will multiply the total by it.
	 * Adds to the calculator history.
	 */
	
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/*
	 * @param value		Integer that the total will be divided by.
	 * Takes parameter "value" and will divide the total by it. If the value
	 * is 0, then we set the total equal to 0.
	 * Adds to the calculator history.
	 */
	
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
			history = history + " / " + value;
		}
		else
		{
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	/*
	 * Method takes no parameters and will print out all of the operations
	 * performed on the total.
	 */
	
	public String getHistory () {
		return history;
	}
}