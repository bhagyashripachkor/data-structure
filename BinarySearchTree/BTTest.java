import java.util.Scanner;
import java.util.StringTokenizer;


public class BTTest {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String input1,input2,input3,input4;
      BT<Integer> bst = new BT<Integer>();
      input1 = in.nextLine();
      String[] str;
      StringTokenizer tokens = new StringTokenizer(input1,",");
      while (tokens.hasMoreElements()) {
        input3 = tokens.nextToken();
        str = input3.split(" ");
        if (str[0].equalsIgnoreCase("I")) {
          bst.insert(Integer.parseInt(str[1]));
        }
        if (str[0].equalsIgnoreCase("S")) {
          input4 = tokens.nextToken();

          //bst.search(Integer.parseInt(input4));
          
        }
        if (str[0].equalsIgnoreCase("R")) { 
          input4 = tokens.nextToken();

          //bst.remove(Integer.parseInt(input4));
        }     

      
      }
    
  }
}
