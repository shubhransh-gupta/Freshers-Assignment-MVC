import java.util.Scanner;

public class BasicUtil {
   static Scanner in = new Scanner(System.in);
   public static String takeLineInput(){
      String input=in.nextLine();
      in.close();
      return input;
   }
   public static int takeIntInput(){
      int input=Integer.parseInt(in.nextLine());
      in.close();
      return input;
   }

}