import java.util.Scanner;


public class HashTest {
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter size"); 
      HashTable ht = new HashTable(scan.nextInt() );
      int[] input = {96,  43,  72,  68,  63,  28};

      for (int i = 0; i < input.length; i++)
          ht.insert( input[i] );                         
          ht.printHashTable();  
       scan.close();   
  }
}
