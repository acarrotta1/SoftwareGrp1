package RAS;


/**
 *Account class: <BR>
 *Represents the Account class.
 *@author Anthony Carrotta
 *@version 1.0
 */
public class Account{

	private String Pin; 
	private String Name; 
	private String Position; 
	private int ID; 
	private double Hours; 
	private double Sales;
	private double PayRate;
	
	/**Account default constructor: <BR>
	 *Represents the default constructor of the Account class.
	 *@author Anthony Carrotta
	 *@version 1.0
	 */
	public Account(){}

	/**Account constructor: <BR>
	 *Represents the constructor of the Account class.
	 *@author Anthony Carrotta
	 *@version 1.0
	 */
	public Account(String newPin, String newName, String newPosition, 
	int newID, double newHours, double newSales, double newPayrate)	{
	}
	
	/**
	 *setPin method: <BR>
	 *Sets the int pin value of an account to be equal to the int parameter
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@param newPin, a String representing the new pin
	 *@return boolean, true if successful and false otherwise
	 */
	public boolean setPin(String newPin){}
		this.Pin = Pin;
		
	/**
	 *getPin method: <BR>
	 *Returns the pin for an account.
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@return String, not empty if there are data stored
	 *for the multiple account instance variables. 
	 */
	public String getPin(){}
		return Pin;
		

		
		
		
		
		
		
		
		
		
		
	/**
	 *setName method: <BR>
	 *Sets a new name for an account.
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@param newName, a String representing the new name
	 *of an account.
	 *@return boolean, true if successful and false otherwise
	 */
//	public boolean setName(String newName){}

	/**
	 *getName method: <BR>
	 *Returns the name of the selected account
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@return String, not empty if there are data stored 
	 *for the multiple account instance variables.
	 */
//	public String getName(){}

	/**
	 *setPosition method: <BR>
	 *Sets a position of an account
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@param newPosition, a String representing the 
	 *new position of an account.
	 *@return boolean, true if successful and false otherwise
	 */
//	public boolean setPosition(String newPosition){}
	
	/**
	 *getPosition method: <BR>
	 *Returns the position of an account.
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@return String, not empty if there is data stored 
	 *for the multiple account instance variables.	 
	 */
//	public String getPosition(){}

	/**
	 *setID method: <BR>
	 *Sets the int ID value of an account to be equal to the int parameter
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@param newID, an integer value
	 *@return boolean, true if newID is a unique int value greater than 0
	 */
//	public boolean setID(String newID){}
	
	/**
	 *getID method: <BR>
	 *Returns the int ID instance variable of the account
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@return String, the int value representing the ID instance variable 
 *of the account. 	 
	 */
//	public String getID(){}
	
	/**
	 *setHours method: <BR>
	 *Sets the double hours value of an account equal to the double parameter
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@param newHours, a double value
	 *@return boolean, true if newHours is a double value which is at least 
 *equal to 0.0.
	 */
//	public boolean setHours(double newHours){}
	
	/**
	 *getHours method: <BR>
	 *Returns the double hours instance variable of the account
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@return double, the double value representing the hours
	 *instance variable of the account.
	 */
//	public double getHours(){}
	
	/**
	 *setSales method: <BR>
	 *Sets the sales of an account
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@param newSales, a double representing sales in dollars
	 *@return boolean, true if successful and false otherwise
	 */
//	public boolean setSales(double newSales){}
	
	/**
	 *getSales method: <BR>
	 *Returns the sales of an account
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@return double, least amount of sales returned is 0
	 */
//	public double getSales(){}
	
	/**
	 *setPayRate method: <BR>
	 *Sets the pay rate of an account
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@param newPayRate, a double representing the new
	 *pay rate of an account. The smallest value for pay
	 *rate is minimum wage
	 *@return boolean, true if successful and false otherwise
	 */
//	public boolean setPayRate(double newPayRate){}
	
	/**
	 *getPayRate method: <BR>
	 *Returns the pay rate of an account
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@return double, least amount of hours returned is
	 *minimum wage
	 */
//	public double getPayRate(){}
	
	/**
	 *toString method: <BR>
	 *Collects instance variable information of the account in a String value
	 *and then returns the String 
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@return String, the String value representing all instance variable
	 *information of the account
	 */
//	public String toString(){}	
	}
}


