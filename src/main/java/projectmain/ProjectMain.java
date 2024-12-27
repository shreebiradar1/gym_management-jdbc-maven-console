package projectmain;

import java.sql.SQLException;
import java.util.Scanner;

import trainer.TrainerMain;
import traniee.TraineeMain;

public class ProjectMain {
	public static void main(String[] args) throws SQLException {
		System.out.println("\t\tWelcome to Gym Management \n");
		
		Scanner sc = new Scanner(System.in);
		//Creating a while loop
		while(true) {
			System.out.println("1.Trainer");
			System.out.println("2.Trainee");
			System.out.println("3.Exit");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				TrainerMain.trainermain();
			} else if(choice == 2) {
				TraineeMain.traineemain();
			} else if(choice == 3) {
				System.out.println("\nExiting Gym Management\n");
				return;
			}
			
		}
	}
}
