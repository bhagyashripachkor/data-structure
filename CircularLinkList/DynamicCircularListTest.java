import java.util.Scanner;
import java.util.StringTokenizer;


public class DynamicCircularListTest {
  static public void main(String args[]) {
    DynamicCircularList<String> dc = new DynamicCircularList<String>();
    Scanner in = new Scanner(System.in);
    String input1,input2,input3,input4;
    int n,k;
    input1 = in.nextLine();
    n = Integer.parseInt(input1);
    System.out.println(n);
    input2 = in.nextLine();
    k = Integer.parseInt(input2);
    System.out.println(k);
    for (int i = 0 ;i < n; i++){
      input3 = in.nextLine();
      StringTokenizer tokens2 = new StringTokenizer(input3);
      while (tokens2.hasMoreElements()) {
        input4 = tokens2.nextToken();
        
        dc.insertAtEnd(input4);
      }
    }
    dc.deleteAtPos(n,k);
   }
}
