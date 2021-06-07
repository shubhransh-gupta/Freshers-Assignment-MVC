package assignment2.view;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import assignment2.UserManager;
import assignment2.data.User;
import assignment2.exceptions.InvalidUserDetailException;
import assignment2.util.DiskManager;

public class UserApplication{
	public static void init() {
		Set<User> users = new TreeSet<User>();
		//get the user from the disk if saved previously
		users= DiskManager.getUsers();
		int choice;
		while(true) 
		{
			Scanner scanner = new Scanner(System.in);	
			System.out.println("1.Add User details");
			System.out.println("2.Display User details");
			System.out.println("3.Delete User details");
			System.out.println("4.Save User details");
			System.out.println("5.Exit\n");
			System.out.println("Enter choice : ");			        
			choice = Integer.parseInt(scanner.nextLine());
			//As per the problem statement take input from user and produce desired result
			switch(choice) 
			{
			case 1:
				try {
					users.add(UserManager.addUser());
				} 
				catch (InvalidUserDetailException e){
					System.out.println("Invalid Details entered : " + e.getMessage());
				}
				break;
			case 2:
				UserManager.displayUsersinSortedForm(users);
				break;
			case 3:
				UserManager.deleteUser(users);
				break;
			case 4:
				DiskManager.saveOnDisk(users);
				break;
			case 5:   
			default:
				System.out.println("Do you wish to save changes before exit ? (y/n)");
				String exitChoice1 = scanner.nextLine();
				if ("y".equals(exitChoice1.toLowerCase())) 
				{
					DiskManager.saveOnDisk(users);
				}
				System.exit(0);			        
			}
			scanner.close();
		  }		  
	}
}
