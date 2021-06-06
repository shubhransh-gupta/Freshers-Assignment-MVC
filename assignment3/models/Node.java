package assignment3.models;
import java.util.HashSet;

public class Node {
    private int nodeId;
    private String nodeName;
    public HashSet<Node> parents = null;
    public HashSet<Node> children = null;
    public Node() {
        parents = new HashSet<Node>();
        children = new HashSet<Node>();
    }
    //set nodeId
    public void setNodeId(int nodeId) {
        this.nodeId=nodeId;
    }
    //set nodeName
    public void setNodeName(String nodeName) {
        this.nodeName=nodeName;
    }
    //getter function of nodeId and nodeName
    public int getNodeId() {
        return this.nodeId;
    }
    public String getNodeName() {
    	return this.nodeName;
    }
    //To add a parent of current node
    public void addParent(Node parent) {
        if(this.parents.contains(parent)) {
            System.out.println("Already added as a parent");
        }
        else {
            this.parents.add(parent);
        }
    }
    //To add a child of current node
    public void addChild(Node child) {
        if(this.children.contains(child)) {
            System.out.println("Already added as a child");
        }
        else {
            this.children.add(child);
        }
    }
    //To delete parent of current node
    public void deleteParent(Node parent) {
        if(this.parents.contains(parent)) {
            this.parents.remove(parent);
        }
        else {
            System.out.println("Dependency not found");
        }
    }
    //To delete child of current node
    public void deleteChild(Node child) {
        if(this.children.contains(child)) {
            this.children.remove(child);
        }
        else {
            System.out.println("Dependency not found");
        }
    }
    @Override
    public String toString() {
        return ("Node id -> "+this.getNodeId()+"\n Node name -> "+this.getNodeName());
    }
}