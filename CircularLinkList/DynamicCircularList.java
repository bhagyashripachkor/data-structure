import java.util.ArrayList;

public class DynamicCircularList<E> {


    public Node<E> start ;
    public Node<E> end ;
    public  ArrayList<E> list1 = new ArrayList<E>();
    public int size,capacity,index ;
 
    
    public DynamicCircularList()
    {
        start = null;
        end = null;
        size = 0;
        index = 0;
    }
    
    public boolean isEmpty()
    {
        return start == null;
    }
 
    public int getSize()
    {
        return size;
    }

    public void insertAtEnd(E val)
    {
        Node<E> nptr = new Node<E>(val,null);    
        nptr.setLink(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setLink(start);
            end = start;            
        }
        else
        {
            end.setLink(nptr);
            end = nptr;            
        }
        size++ ;
    }

    public void deleteAtPos(int position,int k) {
      
      while (size > 1) {
        int middle = 0;
      if (position % 2 == 0)
        middle = position/2;
      else
        middle = position/2 + 1;
      int pos = middle;
      
     
      Node<E> ptr = start;
     
      for (int j = 0; j < pos - 1; j++)
      ptr = ptr.getLink();
      
      
      
      for (int j = 0; j < k - 1; j++)
      ptr = ptr.getLink();
     
      Node<E> element = remove(ptr.getData());
    
      list1.add(element.getData());
      size--;
      position--;
      
      }
      display();
      sorting();
    }
    
    public void sorting() {
      int count = 0;
      for(int i = 0; i < list1.size(); i++) {
        for(int j = 0; j < list1.size(); j++) {
          String[] a = ((String) list1.get(i)).split(",");
          String[] b = ((String) list1.get(j)).split(",");
          if(a[1].compareTo(b[1]) > 0) {
            E temp = list1.get(i);
            list1.set(i, list1.get(j));
            list1.set(j, temp);
          }
        }
      }
      
      for(int i = 0; i < list1.size(); i++) {
        if (count == 0) {
        System.out.print("[ " + list1.get(i) + " ]");
        count++;
        } else
          System.out.print(", [ " + list1.get(i) + " ]");
      }
    }
    private Node<E> remove(E data) {
      
      Node<E> ptr = start; 
      do {
        if (ptr.getLink().data == data) {
          Node<E> n = ptr.getLink();
            ptr.setLink(n.getLink())  ;
            if (n == start) { 
                start = ptr.getLink();
            }
            return n;
        }
        ptr = ptr.getLink();
    } while(ptr != start);
      
      return null;
    }

    public void display()
    {
     
        
        Node<E> ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == start) 
        {
            System.out.println("[ " + start.getData() + " ]");
            return;
        }
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != start) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getLink();
        


    }
    
}