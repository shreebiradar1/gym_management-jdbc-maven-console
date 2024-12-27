package traniee;

import sql.SqlData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RemoveTrainee extends SqlData{
	public static void removetrainee() throws SQLException {
		// Adding connection to Database(MySql)	
				Connection connection = DriverManager.getConnection(url, username, password);
					
				//Statement where we write the MySql query
				Statement statement = connection.createStatement();
				
				// Implementing Scanner class for taking input from the user.
				Scanner sc = new Scanner(System.in);
				
				//Taking input as trainee name for removing
				
				System.out.println("Enter name : ");
				String name = sc.next();
				
				// SQL query
				String query = "DELETE from gym_management.trainee WHERE trainee_name = '" + name + "';";
				statement.execute(query);

				System.out.println("\t User Removed Successfully \n");
				}
	}

