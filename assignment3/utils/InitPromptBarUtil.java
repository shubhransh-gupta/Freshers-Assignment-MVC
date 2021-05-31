package assignment3.utils;

import assignment3.DependencyGraph;
import java.util.HashSet;
import java.util.Scanner;

public class InitPromptBarUtil {  
  public static void initPromptBar() {
	  Scanner scanner =new Scanner(System.in);     
	  HashSet<Integer> _uniqueId=new HashSet<Integer>();  //to store unique node_id for each nodes
      int choice=0;
      while(choice<9) {
          System.out.println("----Prompt----");
          System.out.println("1. Get Immediate Parents of a node");
          System.out.println("2. Get Immediate Chidren of a node");
          System.out.println("3. Get ancestors of a node");
          System.out.println("4. Get descendants of a node");
          System.out.println("5. Delete dependency from a tree");
          System.out.println("6. Delete a node from a tree");
          System.out.println("7. Add dependency to a tree");
          System.out.println("8. Add node to a tree");
          System.out.println("9. Exit");
          System.out.println("Choose any one option");
          try {
              choice = Integer.parseInt(scanner.next());
          } catch(NumberFormatException e) {
              System.out.println("Invalid choice!");
          }
          switch(choice) {
              case 1:DependencyGraph.getParents();
                  break;
              case 2:DependencyGraph.getChildren();
                  break;
              case 3:DependencyGraph.getAncestors();
                  break;
              case 4:DependencyGraph.getDescendants();
                  break;
              case 5:DependencyGraph.delDependency();
                  break;
              case 6:DependencyGraph.delNode();
                  break;
              case 7:DependencyGraph.addDependency();
                  break;
              case 8:DependencyGraph.addNode(_uniqueId);
                  break;
              case 9:System.exit(0);
                  break;
              default:System.out.println("Invalid choice!");
          }
      }
      scanner.close();
  }
}
