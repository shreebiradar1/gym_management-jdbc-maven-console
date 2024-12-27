package traniee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import sql.SqlData;

public class DisplayTrainee extends SqlData{
		public static void displaytrainee() throws SQLException {
			// Adding connection to Database(MySql)	
			Connection connection = DriverManager.getConnection(url, username, password);
				
			//Statement where we write the MySql query
			Statement statement = connection.createStatement();
			
			// Implementing Scanner class for taking input from the user.
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("\n1.Search trainee");
				System.out.println("2.Display all trainee");
				System.out.println("3.Exit Displaying");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.println("Enter name : ");
					String username = sc.next();
					
					//SQL query
					String query = "SELECT * FROM gym_management.trainee where trainee_name = '" + username + "';";

					//ResultSet is class which store result in it.
					//result is an object where executed query result will be stored
					ResultSet result = statement.executeQuery(query);
					
					//ResultSet pointing at 0 index by default while 0 index is empty
					//we set it to index 1 for that we used next() method
					//At the index 1 every column is present
					while (result.next()) {
						//total number of column is 5
						for (int i = 1; i < 6; i++) {
							System.out.println(result.getString(i));
						}
					}
				} else if(choice == 2) {
					String query = "SELECT * FROM gym_management.trainee";
					
					ResultSet result = statement.executeQuery(query);
					
					//Created a loop for displaying all trainee
					while (result.next()) {
						for (int i = 1; i < 6; i++) {
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
