package assignment2.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;

import assignment2.data.User;

public class DiskManager {
	//get the existing user from the disk
	public static Set<User> getUsers() 
	{
		FileInputStream fstream = null;
		Set<User> users = new TreeSet<>();
		try {
			fstream = new FileInputStream("data.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fstream);
			users = (Set<User>) objectInputStream.readObject();
			objectInputStream.close();
		} 
		catch (FileNotFoundException e){
			System.out.println("No User details stored in disk yet.");
		} 
		catch (IOException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return users;
	}
	//changes are saved on the disk	
	public static void saveOnDisk(Set<User> users) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(users);
			objectOutputStream.close();
			System.out.println("Saved Sucessfully");
		} 
		catch(Exception e) {
			System.out.println("Error Occurred : " + e.getMessage());
		}
		return;
	}
}
