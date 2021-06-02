package assignment2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import assignment2.UserManager;
import assignment2.data.User;


class UserManagerTest {
	
	@Test
	void addUserTest() {
		 ClassLoader classLoader = getClass().getClassLoader();
		 File file = new File(classLoader.getResource("assignment2/test/user1.txt").getFile());
		 try {
			    //File file = new File(classLoader.getResource("assignment2/user1").getFile());
	            System.setIn(new FileInputStream(file));
	     } 
		 catch (FileNotFoundException e) {
	            e.printStackTrace();
	     }
		 User currentUser = UserManager.addUser();
	     assertEquals("Shubhransh",currentUser.getName());
	     assertEquals(23,currentUser.getAge());
	     assertEquals("Khamaria Kheri",currentUser.getAddress());
	     assertEquals(94,currentUser.getRollNumber());
	}
	@Test
	void displayUsersinSortedFormTest() {
		FileInputStream fstream = null;
        Set<User> users = new TreeSet<>();
        try {
            fstream = new FileInputStream("data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fstream);
            users = (Set<User>) objectInputStream.readObject();
            objectInputStream.close();
        } 
        catch (FileNotFoundException e){
        	e.printStackTrace();
        } 
        catch (IOException e){
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
		UserManager.displayUsersinSortedForm(users);
		assertEquals("Mayank Bsy", ((TreeSet<User>) users).first().getName());
		assertEquals(22, ((TreeSet<User>) users).first().getAge());
		assertEquals("vizag", ((TreeSet<User>) users).first().getAddress());
		assertEquals(24, ((TreeSet<User>) users).first().getRollNumber());
	
	}
	@Test
	void deleteUserTest() {
		FileInputStream fstream = null;
        Set<User> users = new TreeSet<>();
        try {
            fstream = new FileInputStream("data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fstream);
            users = (Set<User>) objectInputStream.readObject();
            objectInputStream.close();
        } 
        catch (FileNotFoundException e){
        	e.printStackTrace();
        } 
        catch (IOException e){
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
		UserManager.deleteUser(users);
		assertNotEquals(24,((TreeSet<User>) users).first().getRollNumber());
	}
	

}
