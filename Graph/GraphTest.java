import java.util.Scanner;
import java.util.StringTokenizer;


public class GraphTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input1,input2,input3,input4;

    input1 = in.nextLine();
    int size = Integer.parseInt(input1);
    Graph<Character> g = new Graph<Character>(size);
    
    input2 = in.nextLine();
    
    StringTokenizer tokens = new StringTokenizer(input2,"(), ");
    while (tokens.hasMoreElements()) {
      input3 = tokens.nextToken();
      //System.out.println("input3" +input3);
      char v1 = input3.charAt(0);
      //System.out.println("v1"+v1);
      int vertex1 = (int)v1 - 97;
      //System.out.println("ver1"+vertex1);
      input4 = tokens.nextToken();
      //System.out.println("input4"+input4);
      char v2 = input4.charAt(0);
      //System.out.println("v2"+v2);
      int vertex2 = (int)v2 - 97;
      //System.out.println("ver2"+vertex2);
       g.addVertex(vertex1);
      //g.addEdge(vertex1,vertex2);
      //System.out.println(input3);
    }
  }
}
