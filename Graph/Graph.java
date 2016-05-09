import java.util.ArrayList;
import java.util.ListIterator;


public class Graph<Character> {
  
  private int size;
  private int[][] adjacency_matrix;
  private ArrayList<Integer> vertex;
  private ArrayList<SLL> edges; 
  
  public Graph() {
    vertex = new ArrayList<Integer>(size);
  }
  
  public Graph(int size) {
    this.size = size;
    adjacency_matrix = new int[size][size];
  }

  public void addVertex(int vertex1) {
   
   ListIterator<Integer> itr = vertex.listIterator();
   if (itr.hasNext() == null) 
     
   while (itr.hasNext()) {
     int ch = itr.next();
     if( !(vertex1 == ch) ){
       vertex.add(vertex1);
     }
     
   }
  }
  public void printVertex() {
    System.out.println(vertex);
  }

  public void addEdge(int vertex1, int vertex2) {
    
    
  }
}
