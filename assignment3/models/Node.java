package assignment3.models;
import java.util.HashSet;

public class Node {
    private int node_id;
    private String node_name;
    public HashSet<Node> parents = null;
    public HashSet<Node> children = null;
    public Node() {
        parents = new HashSet<Node>();
        children = new HashSet<Node>();
    }

    public void setNodeId(int node_id) {
        this.node_id=node_id;
    }

    public void setNodeName(String node_name) {
        this.node_name=node_name;
    }
    public int getNodeid() {
        return this.node_id;
    }
    public String getNodeName() {
        return this.node_name;
    }
    public void addParent(Node parent) {
        if(this.parents.contains(parent)) {
            System.out.println("Already added as a parent");
        }
        else {
            this.parents.add(parent);
        }
    }
    public void addChild(Node child) {
        if(this.children.contains(child)) {
            System.out.println("Already added as a child");
        }
        else {
            this.children.add(child);
        }
    }
    public void deleteParent(Node parent) {
        if(this.parents.contains(parent)) {
            this.parents.remove(parent);
        }
        else {
            System.out.println("Dependency not found");
        }
    }
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
        return ("Node id -> "+this.getNodeid()+"\n Node name -> "+this.getNodeName());
    }
}