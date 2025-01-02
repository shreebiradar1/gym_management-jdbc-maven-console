package trainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import sql.SqlData;

public class DisplayTrainer extends SqlData{
	public static void displaytrainer() throws SQLException {
		
	// Adding connection to Database(MySql)	
	Connection connection = DriverManager.getConnection(url, username, password);
		
	//Statement where we write the MySql query
	Statement statement = connection.createStatement();
	
	// Implementing Scanner class for taking input from the user.
	Scanner sc = new Scanner(System.in);
	
		while(true) {
			//used \n for a new line
			System.out.println("\n1.Search trainer");	
			System.out.println("2.Display all trainer");
			System.out.println("3.Exit Displaying");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//Instruction for Search
				System.out.println("Enter name : ");
				String username = sc.next();
				
				//SQL query
				String query = "SELECT * FROM gym_management.trainer where trainer_name = '" + username + "';";

				//ResultSet is class which store result in it.
				//result is an object where executed query result will be stored
				ResultSet result = statement.executeQuery(query);
				
				//ResultSet pointing at 0 index by default while 0 index is empty
				//we set it to index 1 for that we used next() method
				//At the index 1 every column is present
				while (result.next()) {
					//total number of column is 7
					for (int i = 1; i < 8; i++) {
						System.out.println(result.getString(i));
					}
				}
			} else if(choice == 2) {
				//Instruction for displaying all trainers
				String query = "SELECT * FROM gym_management.trainer";
				
				ResultSet result = statement.executeQuery(query);
				
				//Created a loop for displaying all trainer
				while (result.next()) {
					for (int i = 1; i < 8; i++) {
						System.out.println(result.getString(i));
					}
				}
				System.out.println("--------------------");
			} else if(choice == 3) {
				System.out.println("\nExiting Displaying\n");
				return;
			} else {
				System.out.println("Invalid choice\n");
			}
		}
	
	}
}
