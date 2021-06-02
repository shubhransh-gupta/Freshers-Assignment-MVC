package assignment3.utils;

import assignment3.models.Node;
import java.util.ArrayList;
import java.util.HashSet;

public class GraphNodeOperation{
	//storing the individual nodes on graph
    static private ArrayList<Node> nodeList=new ArrayList<Node>();
    //creating nodes
    public static void createNodeUtil(int nodeId,String nodeName) {
        Node node=new Node();
        node.setNodeId(nodeId);
        node.setNodeName(nodeName);
        nodeList.add(node);
    }
    //retrieving node list 
    public static ArrayList<Node> getNodeList() 
    {
        return nodeList;
    }
    //delete a particular node whose id is given by user, remove the dependencies with the parent as well as child
    public static void deleteNodeUtil(int nodeId) 
    {
        Node currentNode=null;
        for(Node temp:nodeList) {
            if(temp.getNodeid()==nodeId) {
                currentNode=temp;
                break;
            }
        }
        if(currentNode==null) {
            System.out.println("Invalid Node Id!");
        } else {
            nodeList.remove(currentNode);
            for(Node temp:nodeList) {
                temp.parents.remove(currentNode);
                temp.children.remove(currentNode);
            }
            System.out.println("Node with "+nodeId+" deleted!");
        }
    }
    //display parent nodes of a given node
    public static void displayParentsUtil(Node node) 
    {
        System.out.println("The parents of the node are ");
        for(Node parent:node.parents) {
            System.out.println(parent);
        }
    }
    //display children nodes of a given node
    public static void displayChildrenUtil(Node node) 
    {
        System.out.println("The children of the node are ");
        for(Node child:node.children) {
            System.out.println(child);
        }
    }
    //display all ancestors of a given node
    public static void displayAncestorsUtil(Node node) 
    {
        HashSet<Node> parents=node.parents;
        if(parents==null) {
            System.out.println("No ancestors!");
            return;
        } else {
            System.out.println("Ancestors are:");
            for(Node p:parents) {
                System.out.println(p);
              //recursively call to find more ancestors of parent also
                displayAncestorsUtil(p);
            }
        }
    }
    //display all the descendants of a given node
    public static void displayDescendantsUtil(Node node) 
    {
        HashSet<Node> children=node.children;
        //terminating condition
        if(children==null) {
            System.out.println("No descendants!");
            return;
        } else {
            System.out.println("Descendants are :");
            for(Node child:children) {
                System.out.println(child);
                //recursively call to find more descendants of child also
                displayDescendantsUtil(child);
            }
        }

    }
}

