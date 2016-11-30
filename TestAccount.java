package RAS;
import java.util.Scanner;

public class TestAccount {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int num = input.nextInt();
		
		JDBCAccountList jd = new JDBCAccountList();
		
//		jd.SendOrder(num, name, items);
		
		
		/*JDBC_ItemList it = new JDBC_ItemList(); 		
		System.out.println(it.getItems()); */
	
		//Tests out selecting an item from the db and creating an object
		/*JDBC_ItemList it = new JDBC_ItemList();
		System.out.println(it.getItems());
		System.out.println("Enter an integer");
		int num1 = input.nextInt();
		System.out.println(it.selectItem(num1).toString());*/		

	}

}