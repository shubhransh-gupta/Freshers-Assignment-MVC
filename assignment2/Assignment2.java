package assignment2;

import java.util.Set;
import java.util.TreeSet;
import assignment2.data.User;
import assignment2.view.ApplicationView;

public class Assignment2 {	 
	 public static void main(String[] args) 
	 {
		 Set<User> users = new TreeSet<User>();
		 ApplicationView.init(users);
	 }
}
