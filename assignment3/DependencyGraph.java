package assignment3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import assignment3.models.Node;
import assignment3.utils.GraphNodeOperation;

public class DependencyGraph {
	static Scanner scanner =new Scanner(System.in);
	//To get the parents of the given node
    public static void getParents() {
        System.out.println("Enter node id");
        int nodeId=0;
        try {
            nodeId=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node tempNode=null;
            for(Node temp:nodeList) {
                if(temp.getNodeid()==nodeId) {
                    tempNode=temp;
                }
            }
            if(tempNode==null) {
                System.out.println("Node id does not exist!");
            } else {
                GraphNodeOperation.displayParentsUtil(tempNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    //To get the child of the given node
    public static void getChildren() {
        System.out.println("Enter node id");
        int nodeId=0;
        try {
            nodeId=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==nodeId) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            GraphNodeOperation.displayChildrenUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    //get all ancestors to a given node
    public static void getAncestors() {
        System.out.println("Enter node id");
        int nodeId=0;
        try {
            nodeId=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==nodeId) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            	GraphNodeOperation.displayAncestorsUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    //get all descendants to a given node 
    public static void getDescendants() {
        System.out.println("Enter node id");
        int nodeId=0;
        try {
            nodeId=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==nodeId) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            	GraphNodeOperation.displayDescendantsUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    //To add a dependency between two nodes
    public static void addDependency() {
        System.out.println("Enter parent nodeId");
        try {
            int parent_id=Integer.parseInt(scanner.next());
            System.out.println("Enter child nodeId");
            int child_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node parent_node=null;
            Node child_node=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==parent_id) {
                    parent_node=tmp;
                }
                if(tmp.getNodeid()==child_id) {
                    child_node=tmp;
                }
            }
            if(parent_node==null || child_node==null) {
                System.out.println("Invalid Node id!");
            }
            else {
                parent_node.addChild(child_node);
                child_node.addParent(parent_node);
                System.out.println("Dependency added ");
            }
        } catch(Exception e) {
            System.out.println("Invalid input type!");
        }
    }
    //To delete a dependency between two nodes
    public static void delDependency() {
        System.out.println("Enter parent nodeId");
        try {
            int parent_id=Integer.parseInt(scanner.next());
            System.out.println("Enter child nodeId");
            int child_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperation.getNodeList();
            Node parent_node=null;
            Node child_node=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==parent_id) {
                    parent_node=tmp;
                }
                if(tmp.getNodeid()==child_id) {
                    child_node=tmp;
                }
            }
            if(parent_node==null || child_node==null) {
                System.out.println("Invalid Node id!");
            }
            else {
                parent_node.deleteChild(child_node);
                child_node.deleteParent(parent_node);
                System.out.println("Dependency removed ");
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input type!");
        }
    }
    //add a unique node in the Graph 
    public static void addNode(HashSet<Integer> uniqueId) {
        System.out.println("Enter Node Id");
        try {
            int nodeId=Integer.parseInt(scanner.next());
            if(uniqueId.contains(nodeId)) {
                System.out.println("Unique Id is required!");
            } else {
                uniqueId.add(nodeId);
                System.out.println("Enter node name!");
                String nodeName=scanner.next();
                GraphNodeOperation.createNodeUtil(nodeId, nodeName);
                System.out.println("Node added!");
            }
        } catch(Exception e) {
            System.out.println("Invalid input type!");
        }
    }
    //To delete a node in graph if exist
    public static void delNode() {
        System.out.println("Enter node id of node to be deleted");
        try {
            int nodeId=Integer.parseInt(scanner.next());
            GraphNodeOperation.deleteNodeUtil(nodeId);
        } catch(NumberFormatException e) {
            System.out.println("Invalid Input type!");
        }
    }
    
}
