package assignment2.view;

import java.util.Scanner;
import java.util.Set;

import assignment2.Usermanager;
import assignment2.data.User;
import assignment2.exceptions.InvalidUserDetailException;
import assignment2.util.DiskManager;

public class InitPromptBarView {
	public static void initPrompt(Set<User> _user) {
		  Scanner in = new Scanner(System.in);		   
		  _user= DiskManager.getUsers();		 
		  int choice;
		  while(true) {
				 System.out.println("1.Add User details");
			        System.out.println("2.Display User details");
			        System.out.println("3.Delete User details");
			        System.out.println("4.Save User details");
			        System.out.println("5.Exit\n");
			        System.out.println("Enter choice : ");
			        
			        choice = Integer.parseInt(in.nextLine());
			         
			        switch(choice) {
			        case 1:
			        	 try {
			                 _user.add(Usermanager.addUser());
			             } catch (InvalidUserDetailException e) {
			                 System.out.println("Invalid Details entered : " + e.getMessage());
			             }
		                    break;
		            case 2:
		            	    Usermanager.displayUsersinSortedForm(_user);
		                    break;
		            case 3:
		            	    Usermanager.deleteUser(_user);
		                    break;
		            case 4: DiskManager.saveOnDisk(_user);
		            	    break;
		            case 5:   
		            default:
		            	System.out.println("Do you wish to save changes before exit ? (y/n)");
		                String exitChoice1 = in.nextLine();
		                if ("y".equals(exitChoice1.toLowerCase())) {
		                	DiskManager.saveOnDisk(_user);
		               }
		                 System.exit(0); 
			        
			        }
				 }
	  }
}
