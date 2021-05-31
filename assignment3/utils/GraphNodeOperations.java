package assignment3.utils;

import assignment3.models.Node;
import java.util.ArrayList;
import java.util.HashSet;

public class GraphNodeOperations{
    static private ArrayList<Node> nodeList=new ArrayList<Node>();
    public static void createNodeUtil(int node_id,String node_name) {
        Node node=new Node();
        node.setNodeId(node_id);
        node.setNodeName(node_name);
        nodeList.add(node);
    }
    public static ArrayList<Node> getNodeList() {
        return nodeList;
    }
    public static void deleteNodeUtil(int node_id) {
        Node currentNode=null;
        for(Node temp:nodeList) {
            if(temp.getNodeid()==node_id) {
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
            System.out.println("Node with "+node_id+" deleted!");
        }
    }
    public static void displayParentsUtil(Node node) {
        System.out.println("The parents of the node are ");
        for(Node parent:node.parents) {
            System.out.println(parent);
        }
    }
    public static void displayChildrenUtil(Node node) {
        System.out.println("The children of the node are ");
        for(Node child:node.children) {
            System.out.println(child);
        }
    }

    public static void displayAncestorsUtil(Node node) {
        HashSet<Node> parents=node.parents;
        if(parents==null) {
            System.out.println("No ancestors!");
            return;
        } else {
            System.out.println("Ancestors are:");
            for(Node p:parents) {
                System.out.println(p);
                displayAncestorsUtil(p);
            }
        }
    }

    public static void displayDescendantsUtil(Node node) {
        HashSet<Node> children=node.children;
        if(children==null) {
            System.out.println("No descendants!");
            return;
        } else {
            System.out.println("Descendants are :");
            for(Node child:children) {
                System.out.println(child);
                displayDescendantsUtil(child);
            }
        }

    }
}

