import java.util.Scanner;


public class HashTableWithChainingTest {
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter size"); 

      HashTableWithChaining htwc = new HashTableWithChaining(scan.nextInt() );

      char ch;
      
      do    
      {
         
          System.out.println("1. insert ");
          System.out.println("2. remove");
          System.out.println("3. search");


          int choice = scan.nextInt();            
          switch (choice)
          {
          case 1 : 
              System.out.println("Enter element to insert");
              htwc.insert( scan.nextInt() ); 
              break;                          
          case 2 :                 
              System.out.println("Enter element to delete");
              htwc.remove( scan.nextInt() ); 
              break;                        
          case 3 :
              System.out.println("Enter element to search");
              htwc.search( scan.nextInt());
              
              break;
             
          default : 
              System.out.println("Enter correct choice");
              break;   
          }
        
          htwc.printHashTable();  

          System.out.println("Do you want to continue(Y/N)");
          ch = scan.next().charAt(0);                        
      } while (ch == 'Y'|| ch == 'y');
      scan.close();
  }
}
