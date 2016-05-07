import java.util.Scanner;
import java.util.StringTokenizer;


public class HeapTest {
  public static void main(String[] args) {
    
    
    Scanner in = new Scanner(System.in);
    String input1,input2,input3,input4,input5;
    MinHeap mh = new MinHeap();
    input1 = in.nextLine();
    StringTokenizer tokens = new StringTokenizer(input1," , ");
    while (tokens.hasMoreElements()) {
      input3 = tokens.nextToken();
      if (input3.equalsIgnoreCase("i")) {

        input4 = tokens.nextToken();

        mh.insert(Integer.parseInt(input4));
        mh.display();
      }
      if (input3.equalsIgnoreCase("mo")) {
        input4 = tokens.nextToken();
        input5 = tokens.nextToken();

        mh.modify(Integer.parseInt(input4),Integer.parseInt(input5));
        mh.display();
      }
      if (input3.equalsIgnoreCase("d")) { 
        mh.extract_min();
        mh.display();
      }     
      
    }
  }
}
