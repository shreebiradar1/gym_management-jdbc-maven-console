package trainer;

import java.sql.SQLException;
import java.util.Scanner;

public class TrainerMain {
	public static void trainermain() throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		//Here is the trainer main class where we perform instruction on Trainer will be seen here
		System.out.println("\nWhat would you like to do");
		
		//Creating a while loop for multiple instructions
		while(true) {
			System.out.println("1. Adding Trainer");
			System.out.println("2. Displaying Trainer");
			System.out.println("3. Removing Trainer");
			System.out.println("4. Exit");
			
			//Storing user input inside the choice variable
			int choice = sc.nextInt();
			
			//Implementing instruction with conditional statement
			if(choice == 1) {
				//Written instruction inside that class
				//Directly calling the static method
				//Which is present inside the same package
				AddTrainer.addtrainer();
			}
			else if(choice == 2) {
				//Same here
				DisplayTrainer.displaytrainer();
			}
			else if(choice == 3) {
				RemoveTrainer.removetrainer();
			}
			else if(choice == 4) {
				System.out.println("Exiting from Trainer");
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
