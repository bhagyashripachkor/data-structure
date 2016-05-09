import java.util.Scanner;


public class SLL {
  Node start;
  Node end ;
  int size;

  public SLL() {
    start = null;
    end = null;
    size = 0;

  }
  
  public boolean isEmpty() {
    if (start == null) 
      return true;
    else
      return false;
  }

  public void insert(int n) {
    Node node = new Node(n,null);
    if (start == null) {
      start = node;
      end = start;
    } else {
      end.setAddress(node);
      end = node;
    }
    size++;
  }  
  
  public int getSize() {
    return size;
  }
  
  public void printList() {
  
    if (size == 0) {
      System.out.println("List is empty");
    } else if (start.getAddress() == null) {
      System.out.println(start.getData());
    } else {
      Node link = start;
      System.out.print(link.getData() + "->");
      link = start.getAddress();
      while (link.getAddress() != null) {
        System.out.print(link.getData() + "->");
        link = link.getAddress();
      }
      System.out.println(link.getData() + "\n");
    }
  }

  public void insertAfter(int element1, int element2) {
    Node node = new Node(element1,null);
    Node link = start;
    Node temp;

    for (int i = 0; i < size; i++) {
      if (link.getData() == element2) {
        temp = link.getAddress();
        link.setAddress(node);
        node.setAddress(temp);
        break;
      }
      link = link.getAddress();
    }
    size++;
  }

  public void insertBefore(int element1, int element2) {
    Node node = new Node(element1,null);
    Node link = start;
    Node previous = null;
    if (start == null) {
      start = node;
      end = start;
    } else {
    for (int i = 0; i < size; i ++) {
      if (link.getData() == element2) {
        node.setAddress(link);
        node.setData(element1);
        previous.setAddress(node);
        size++;
        break;
      }
      else {
        previous = link;
        link = link.getAddress();
      }
     }
    }
  }  
  
  public void delete(int element1) {
        Node position = start;    
        Node nextPosition1;   
        Node nextPosition2; 
        if (end.getData() == element1 ) {
          System.out.println("in pop back");
          popBack();
        } else if(start.getData() == element1) {
          System.out.println("in pop front");
          popFront();
        } else {
        while (position != null){
          if (position.getAddress().getData()==element1){
            nextPosition1 = position.getAddress();    
            nextPosition2 = nextPosition1.getAddress();
            position.setAddress(nextPosition2);
            size--;
            break;
          } else {   
                position = position.getAddress();
                }
          } 
        }
  }
  
  public void deleteIndex(int position) {
    if (position == 1) {
      start = start.getAddress();
      size--;
   } 
    else if (position == size) {
      Node n1 = start;
      Node n2 = start;
      while (n1 != end) {
        n2 = n1;
        n1 = n1.getAddress();
      }
      end = n2;
      end.setAddress(null);
      size--;
    
    } else {
      Node link1 = start;
      position = position - 1;
      for (int i = 1; i < size - 1; i++) {
        if (i == position) {
          Node temp  = link1.getAddress();
          temp = temp.getAddress();
          link1.setAddress(temp);
          break;
        }
        //link1 = link1.getAddress();
      }
      size--;
    }
  }
  
  public void empty() {
    Node  link = start;
    for (int i =0; i <= size; i++) {
      link.setAddress(null);
      size--;
    }
    size--;
  }
  
  public void pushFront(int element1) {
    Node link = start;
    Node node = new Node(element1,null);
    Node temp;
    size++;
    if (start == null) {
      start = node;
      end = start;
    } else {
      int n = start.getData();
      temp = start.getAddress();
      start.setAddress(node);
      start.setData(element1);
      node.setAddress(temp);
      node.setData(n);

    }
  }
  
  public void pushBack(int element1) {
    Node link = start;
    Node node = new Node(element1,null);
    size++;
    if (start == null) {
      start = node;
      end = start;
    } else {
      end.setAddress(node);
      end = node;
    }
  }

  public void popFront() {
    if (start == null) 
      System.out.println("List is empty");
    else {
      start =start.getAddress();
      size--;
    }    
  }
  
  public void popBack(){
    if (start == null)
      System.out.println("List is empty");
    else {
      Node n1 = start;
      Node n2 = start;
      while (n1 != end)
      {
          n2 = n1;
          n1 = n1.getAddress();
      }
      end = n2;
      end.setAddress(null);
      size --;
    }
  }
  
  public void concatList(SLL sll1) {
    end.setAddress(sll1.start);
    end = sll1.end;
  }

  public void concatIndexList(SLL sll1, int pos) {
    Node link = start;
    for (int i =1; i <= size; i++) {
      if (i == pos - 1) {
        Node temp1 = link.getAddress();
        Node temp2 = sll1.start;
        Node temp3 = sll1.end;
        link.setAddress(temp2);
        temp3.setAddress(temp1);
      }
      link = link.getAddress();
    }
    
  }
  
    
}
