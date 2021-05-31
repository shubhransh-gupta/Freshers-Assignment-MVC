package assignment3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import assignment3.models.Node;
import assignment3.utils.GraphNodeOperations;

public class DependencyGraph {
	static Scanner scanner =new Scanner(System.in);
    public static void getParents() {
        System.out.println("Enter node id");
        int node_id=0;
        try {
            node_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==node_id) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
                GraphNodeOperations.displayParentsUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    public static void getChildren() {
        System.out.println("Enter node id");
        int node_id=0;
        try {
            node_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==node_id) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            GraphNodeOperations.displayChildrenUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    public static void getAncestors() {
        System.out.println("Enter node id");
        int node_id=0;
        try {
            node_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==node_id) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            	GraphNodeOperations.displayAncestorsUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    public static void getDescendants() {
        System.out.println("Enter node id");
        int node_id=0;
        try {
            node_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
            Node tmpNode=null;
            for(Node tmp:nodeList) {
                if(tmp.getNodeid()==node_id) {
                    tmpNode=tmp;
                }
            }
            if(tmpNode==null) {
                System.out.println("Node id does not exist!");
            } else {
            	GraphNodeOperations.displayDescendantsUtil(tmpNode);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    public static void delDependency() {
        System.out.println("Enter parent node_id");
        try {
            int parent_id=Integer.parseInt(scanner.next());
            System.out.println("Enter child node_id");
            int child_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
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
    public static void delNode() {
        System.out.println("Enter node id of node to be deleted");
        try {
            int node_id=Integer.parseInt(scanner.next());
            GraphNodeOperations.deleteNodeUtil(node_id);
        } catch(NumberFormatException e) {
            System.out.println("Invalid Input type!");
        }
    }
    public static void addDependency() {
        System.out.println("Enter parent node_id");
        try {
            int parent_id=Integer.parseInt(scanner.next());
            System.out.println("Enter child node_id");
            int child_id=Integer.parseInt(scanner.next());
            ArrayList<Node> nodeList=GraphNodeOperations.getNodeList();
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
    public static void addNode(HashSet<Integer> _uniqueId) {
        System.out.println("Enter node_id");
        try {
            int node_id=Integer.parseInt(scanner.next());
            if(_uniqueId.contains(node_id)) {
                System.out.println("Unique Id is required!");
            } else {
                _uniqueId.add(node_id);
                System.out.println("Enter node name!");
                String node_name=scanner.next();
                GraphNodeOperations.createNodeUtil(node_id, node_name);
                System.out.println("Node added!");
            }
        } catch(Exception e) {
            System.out.println("Invalid input type!");
        }
    }
}
