package trainer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import sql.SqlData;

public class AddTrainer extends SqlData{
	public static void addtrainer() throws SQLException {
		
		
	// Adding connection to Database(MySql)	
	Connection connection = DriverManager.getConnection(url, username, password);
		
	//Statement where we write the MySql query
	Statement statement = connection.createStatement();
	
	// Implementing Scanner class for taking input from the user.
	Scanner sc = new Scanner(System.in);


	//Adding trainer information
	System.out.println("Enter trainer id : ");
	int id = sc.nextInt();
	
	System.out.println("Enter trainer name : ");
	String name = sc.next();
	
	System.out.println("Enter trainer age : ");
	int age = sc.nextInt();
	
	System.out.println("Enter trainer email : ");
	String email = sc.next();
	
	System.out.println("Enter trainer mobile : ");
	String mobile = sc.next();
	
	System.out.println("Enter trainer experience : ");
	int exp = sc.nextInt();
	
	System.out.println("Trainer type : ");
	String type = sc.next();
	
	//Writing MySql query
	String query = "INSERT INTO gym_management.trainer"
				 + "(trainer_id, trainer_name, trainer_age, trainer_email, trainer_mobile, trainer_experience, trainer_type)"
				 + "VALUES ( "+ id +", '" + name + "', " + age + ", '" + email + "', '" + mobile + "', " + exp + ", '" + type + "');";
	
	//To run the SQL query we use execute method which is present inside the Statement class
	
	statement.execute(query);
	
	System.out.println("\nNew Trainer has been added\n");
	
	
	}
}
