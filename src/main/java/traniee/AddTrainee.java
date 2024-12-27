package traniee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Created own class where url, username, password kept.
import sql.SqlData;

//Extends the Sql class data (URL, username, password) is kept.
public class AddTrainee extends SqlData{
	public static void addtrainee() throws SQLException {
		
		// Adding connection to Database(MySql)	
		Connection connection = DriverManager.getConnection(url, username, password);
		
		//Statement where we write the MySql query
		Statement statement = connection.createStatement();
		
		// Implementing Scanner class for taking input from the user.
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the User (Manager).
		System.out.println("Enter Trainee id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Trainee name : ");
		String name = sc.next();
		
		System.out.println("Enter Trainee age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Trainee email : ");
		String email = sc.next();
		
		System.out.println("Enter Trainee number : ");
		String number = sc.next();
		
		//Writing MySql query 
		String query = "INSERT INTO gym_management.trainee"
					 + "(trainee_id, trainee_name, trainee_age, trainee_email, trainee_mobile)"
					 + "VALUES ("+id+", '" + name + "', " + age + ", '" + email + "', '"+ number + "');";
		
		//To execute the Sql query
		statement.execute(query);
		System.out.println("New Trainee has been added");
		
		
	}
}
