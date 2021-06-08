package assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import assignment2.data.User;
import assignment2.util.DiskManager;

class DiskManagerTest {

	@Test
	void getUsersTest() {
		Set<User> userList = DiskManager.getUsers();
		assertEquals("Mayank Bsy",((TreeSet<User>)userList).first().getName());
		assertEquals(22,((TreeSet<User>)userList).first().getAge());
		assertEquals("vizag",((TreeSet<User>)userList).first().getAddress());
		assertEquals(24,((TreeSet<User>)userList).first().getRollNumber());
		//checking for false values
		assertNotEquals(-22,((TreeSet<User>)userList).first().getAge());
		assertNotEquals(-24,((TreeSet<User>)userList).first().getRollNumber());
	}

}
