import java.util.Scanner;
import java.util.StringTokenizer;


public class UnboundedArrayTest {
  public static void main(String[] args) {
    
    UnboundedArray<Integer> ub = null;
    Scanner in = new Scanner(System.in);
    String input1,input2,input3,input4;
    int beta = 0,alpha = 0;
   
    input2 = in.nextLine();
    StringTokenizer tokens = new StringTokenizer(input2,", ");
    String token;
    while(tokens.hasMoreTokens()) {
      token = tokens.nextToken();
      beta = Integer.parseInt(token);
      alpha = Integer.parseInt(tokens.nextToken());
      ub = new UnboundedArray<Integer>(beta,alpha);
      
      input3 = in.nextLine();
      StringTokenizer token1 = new StringTokenizer(input3,",");
      while (token1.hasMoreElements()) {
      input4 = token1.nextToken();
      if (input4.equalsIgnoreCase("push")){
        ub.pushBack(1);
       }
      else if (input4.equalsIgnoreCase("pop")) {
        ub.popBack();
      }
      }
    }
  } 
 }
