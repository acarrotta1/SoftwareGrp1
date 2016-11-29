package RAS;
/**AccountList class: <BR>
 *Represents the collection of multiple Account objects.
 *@author Ahmed B. Qureshi
 *@version 1.0
 */
public class AccountList{

	private Account[] list;

	/**AccountList default constructor: <BR>
	 *Represents the default constructor which automatically instantiates 
	 *the Account[] list instance variable 
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 */
	public AccountList(){}

	/**Login method: <BR>
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@param Pin, a string that represents a pin 
	 * to log into an account from the account list.
	 *@return account, pin entered matches a pin in an account
	 * from the account list, and display the designated interface for position.
	 */
	public Account Login(String Pin){}

	/**Logout method: <BR>
	 *@author Jonathan Gomes
	 *@version 1.0
	 *@return boolean, logs out of account.
	 */
	public boolean Logout(){}	

	/**
	 *EditEmployee method: <BR>
	 *Sets the instance variables in the Account to be equal to the parameters
 *using set methods.
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@param ID, an int value
	 *@param Pin, a String value
	 *@param Name, a String value
	 *@param Position, a String value
	 *@param Hours, a double value
	 *@param Sales, a double value
 	 *@param PayRate, a double value
	 *@return Account, the Account object representing the updated Account
	 */
	public Account EditEmployee(int ID, String Pin, String Name, String Position, 
		double Hours, double Sales, double PayRate){}

	/**
	 *RemoveEmployee method: <BR>
	 *Prompts the user to ask which employee to remove, and then 
	 *changes the account.
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@param ID, an int uniquely representing an account object.
	 *@return Account, simply returns the Account when the employee to remove is selected
	 */
	public Account RemoveEmployee(int ID){}

	/**
	 *AddEmployee method: <BR>
	 *Prompts the user to enter employee credentials, and then 
	 *adds the account.
	 *@author Anthony Carrotta
	 *@version 1.0
	 *@param ID, an int value
	 *@return Account, simply returns the Account if changes are made
	 */
	public Account AddEmployee(int ID){}
	
	/**
	 *searchAccount method: <BR>
	 *Searches for an Account that has its int ID instance 
 *variable equal to the parameter.
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@return Account, the Account object that has its ID instance
 *variable equal to the parameter .
	 */
	public Account searchAccount(int ID){}
	
	/**
	 *toString method: <BR>
	 *Collects all instance variable information of all accounts in a String variable
 *from Account[] list,and then returns the String value.
	 *@author Ahmed B. Qureshi
	 *@version 1.0
	 *@return String, the String value that holds all instance variable information
	 *of all Account objects.
	 */
	public String toString(){}


}






