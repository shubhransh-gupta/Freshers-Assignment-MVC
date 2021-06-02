package assignment2;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;


import assignment2.data.Course;
import assignment2.data.User;
import assignment2.exceptions.InvalidUserDetailException;

public class UserManager {	
	public static User addUser() throws InvalidUserDetailException 
	{
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("Enter user details");
        System.out.print("Full Name : ");
        String name = in.nextLine();
        System.out.print("Age : ");
        int age, roll;
        try 
        {
            age = Integer.parseInt(in.nextLine());
            if (age <= 0) 
            	throw new NumberFormatException();
        } 
        catch (NumberFormatException e) 
        {
            throw new InvalidUserDetailException("Age should be a valid +ve integer");
        }
        System.out.print("Address : ");
        String address = in.nextLine();
        System.out.print("Roll Number : ");
        try 
        {
            roll = Integer.parseInt(in.nextLine());
            if (roll <= 0) 
            	throw new NumberFormatException();
        } 
        catch (NumberFormatException e) 
        {
            throw new InvalidUserDetailException("Roll number should be a valid +ve integer");
        }
        System.out.print("Courses enrolled : ");

        String[] courses = in.nextLine().split(" ");
        List<Course> coursesList = new ArrayList<>(
                Stream.of(courses).map(c -> new Course(c)).collect(Collectors.toList())
        );
        if (coursesList.size() < 4)
            throw new InvalidUserDetailException("Process Failed : You must choose at least 4 out of 6 courses ! ");
        return new User(name, age, address, roll, coursesList);
    }
	public static void displayUsersinSortedForm(Set<User> user) 
	{
		int ch, order;
		Scanner in = new Scanner(System.in);	
		System.out.println("1. Name");
        System.out.println("2. Roll number");
        System.out.println("3. Age");
        System.out.println("4. Address");
        System.out.print("Fields to be choosed for sorting (Enter choice) :  ");        
        ch = Integer.parseInt(in.nextLine());
        System.out.println("1. Ascending order ");
        System.out.println("2. Descending order");
        System.out.print("Enter choice : ");
        order = Integer.parseInt(in.nextLine());
        //handling other options
        if (order < 1 || order > 2 || ch < 1 || ch > 4) 
        {
            System.out.println("Invalid Option ! ");
            in.close();
            return;
        }    
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Name\t\tRoll Number\t\tAge\t\tAddress\t\tCourses");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        user.stream().sorted((a, b) -> {
            int result = 0;
            switch (ch) {
                case 1:
                    result = a.getName().compareTo(b.getName());
                    break;
                case 2:
                    result = a.getRollNumber() - b.getRollNumber();
                    break;
                case 3:
                    result = a.getAge() - b.getAge();
                    break;
                case 4:
                    result = a.getAddress().compareTo(b.getAddress());
                    break;
            }
         //If descending order is selected , invert the sign of result
            if (order == 2) result = -result;
            return result;
        }).forEach(u -> u.display());
        in.close();		
	}
	public static void deleteUser(Set<User> user) {
		System.out.println("Enter roll number : ");
		Scanner in = new Scanner(System.in);
        int rollno=in.nextInt();
        //handling negative test cases
        if(rollno<=0) 
        {
        	 System.out.println("Invalid Roll number ! It must be an +ve integer ");
        	 in.close();	
        	 return;
        }
        //searching the person with the given roll no and delete it
        final User[] filteredUser = {null};
        user.stream().filter(e -> e.getRollNumber() == rollno).findFirst().ifPresent(u -> filteredUser[0] = u);
        User userTobeDeleted = filteredUser[0];
        if (userTobeDeleted != null) 
        	user.remove(userTobeDeleted);
        System.out.println("User : " + userTobeDeleted.getName() + " deleted.");
        in.close();	
	}
}
