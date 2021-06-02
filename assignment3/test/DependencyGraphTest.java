package assignment3.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import assignment3.DependencyGraph;
import assignment3.models.Node;
import assignment3.utils.GraphNodeOperation;

class DependencyGraphTest {

	@Test
	void addNodeTest(){
		HashSet<Integer> uniqueId= new HashSet<Integer>();
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream input1 = new ByteArrayInputStream(("1" + System.lineSeparator() + "One").getBytes());
		//creating two testing nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");
		System.setIn(input1);
		
		DependencyGraph.addNode(uniqueId);
		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		assertEquals("One", ((String) nodeList.get(0).getNodeName()));
		assertEquals(1, ((Integer) nodeList.get(0).getNodeId()));
		System.setIn(sysInBackup);
		
	}
	@Test
	void deleteNodeTest() {
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
		//creating two testing nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");
		System.setIn(in);
		DependencyGraph.delNode();
		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		assertNotEquals(1,((Integer) nodeList.get(0).getNodeId()));
		assertNotEquals("One", ((String) nodeList.get(0).getNodeName()));
		System.setIn(sysInBackup);
	}/*
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}*/
    @Test
    void addDependencyTest() {
		InputStream sysInBackup = System.in; 
		ByteArrayInputStream input = new ByteArrayInputStream(("1" + System.lineSeparator() + "2").getBytes());
		//creating two testing nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");
		//setting the buffer for console input
		System.setIn(input);		
		//testing target function
		DependencyGraph.addDependency();

		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		assertEquals(1, nodeList.get(1).parents.size());
		assertEquals(1, nodeList.get(0).children.size());
		System.setIn(sysInBackup);
		
		
    }
    /*@After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }*/
    
}
