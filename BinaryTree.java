import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BinaryTree
{ 
  public static void main(String[] args) {
    

    Scanner in = new Scanner(System.in);
    String input1,input2,input3 = null,input4,input5;
   
    BT bt = new BT(); 
    input1 = in.nextLine();
    int level = Integer.parseInt(input1);
    
    int count =0;
    String str;
    int i = 0;
    while (count < level) {
    input2 = in.nextLine();
    StringTokenizer tokens = new StringTokenizer(input2," ");
    while (tokens.hasMoreTokens()) {
      str = tokens.nextToken();
      if (str.equals("_")) {
      
        bt.insert(0);
     
      }
      else {
      int v = Integer.parseInt(str);
      bt.insert(v);
      
      }
      
    }
    count++;
    }
      bt.inorder();
      BT.print();
    }
  }

