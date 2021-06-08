package assignment2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import assignment2.view.UserApplication;

class UserApplicationTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	@Test
	void initTest() {
		UserApplication.init();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		print(outContent);
		String expectedOutput  = "1.Add User details\r\n 2.Display User details\r\n3.Delete User details\r\n4.Save User details\r\n5.Exit\r\n\r\nEnter choice :";
		// Do the actual assertion.
		assertEquals(expectedOutput, outContent.toString());
	}
	private void print(ByteArrayOutputStream outContent) {
		System.out.println(outContent);

	}
	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}
}
