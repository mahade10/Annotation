package main;

/**
 * <h1>Simple Calculator</h1>
 * The AddNumber program implements an application that
 * simply adds two given integers number and prints
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more 
 * user friendly and it is assumed as a high quality code
 * @author Abir
 * @version 1.0
 * @since 2018-10-29
 *
 */
public class Calculator {
	/**
	 * this method is used to add two integers
	 * @param a is the first parameter of this method
	 * @param b is the second parameter of this method
	 * @return addition of a and b
	 */
	
	public  int add(int a,int b) {
		
		return a+b;
	}
	/**
	 * this method is used to sub two integers
	 * @param a is the first parameter of this method
	 * @param b is the second parameter of this method
	 * @return subtraction of a and b
	 */
	
    public  int sub(int a,int b) {
		
		return a-b;
	}
    /**
	 * this method is used to multiplication two integers
	 * @param a is the first parameter of this method
	 * @param b is the second parameter of this method
	 * @return multiplition of a and b
	 */
    
    public  int mul(int a,int b) {
		
		return a*b;
	}
    /**
	 * this method is used to division two integers
	 * @param a is the first parameter of this method
	 * @param b is the second parameter of this method
	 * @return division of a and b
	 */
    
    public  int div(int a,int b) {
		
		return a/b;
	}
}
