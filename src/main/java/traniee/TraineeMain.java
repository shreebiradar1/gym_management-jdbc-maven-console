package traniee;

import java.sql.SQLException;
import java.util.Scanner;


public class TraineeMain {
	public static void traineemain() throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nWhat would you like to do");
		
		//Creating a while loop for multiple instructions
		while(true) {
			System.out.println("1. Adding Trainee");
			System.out.println("2. Displaying Trainee");
			System.out.println("3. Removing Trainee");
			System.out.println("4. Exit");
			
			//Storing user input inside the choice variable
			int choice = sc.nextInt();
			
			//Implementing instruction with conditional statement
			if(choice == 1) {
				//Written instruction inside that class
				//Directly calling the static method
				AddTrainee.addtrainee();
			}
			else if(choice == 2) {
				//Same here
				DisplayTrainee.displaytrainee();
			}
			else if(choice == 3) {
				RemoveTrainee.removetrainee();
			}
			else if(choice == 4) {
				System.out.println("Exiting from Trainee");
				//Getting out from the while loop
				return;
			}
			else {
				//Checking invalid conditions
				System.out.println("Invaild selection");
				System.out.println("Try again");
			}
		}
	}
}
