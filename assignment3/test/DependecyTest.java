package assignment3.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import assignment3.DependencyGraph;
import assignment3.models.Node;
import assignment3.utils.GraphNodeOperation;

class DependecyTest {
	@Test
	void delDependencyTest() {
		InputStream sysInBackup = System.in; 
		ByteArrayInputStream input = new ByteArrayInputStream(("1" + System.lineSeparator() + "2").getBytes());
		//creating two testing nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");
		//setting the buffer for console input
		System.setIn(input);		
		//testing target function
		DependencyGraph.delDependency();

		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		assertEquals(0, nodeList.get(1).parents.size());
		assertEquals(0, nodeList.get(0).children.size());
		System.setIn(sysInBackup);
	}
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
	@Test
	void getAncestorsTest() {
		InputStream sysInBackup = System.in; 
		ByteArrayInputStream input = new ByteArrayInputStream(("2").getBytes());
		//creating two nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");		
		//setting the buffer for console input

		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		nodeList.get(1).addParent(nodeList.get(0));
		System.setIn(input);		
		//testing target function
		DependencyGraph.getAncestors();

		//hence Node1 is the parent of Node2 & Node2 is the child of Node1
		assertEquals(1, nodeList.get(1).parents.size());
		assertEquals(0, nodeList.get(0).children.size());
		System.setIn(sysInBackup);
	}
	@Test
	void getDescendantsTest() {
		InputStream sysInBackup = System.in; 
		ByteArrayInputStream input = new ByteArrayInputStream(("1").getBytes());
		//creating two nodes
		GraphNodeOperation.createNodeUtil(1,"One");
		GraphNodeOperation.createNodeUtil(2,"Two");		
		//setting the buffer for console input

		ArrayList<Node> nodeList = GraphNodeOperation.getNodeList();
		nodeList.get(0).addChild(nodeList.get(1));
		System.setIn(input);		
		//testing target function
		DependencyGraph.getDescendants();

		//hence Node1 is the parent of Node2 & Node2 is the child of Node1
		assertEquals(0, nodeList.get(0).parents.size());
		assertEquals(1, nodeList.get(0).children.size());
		System.setIn(sysInBackup);
	}

}
