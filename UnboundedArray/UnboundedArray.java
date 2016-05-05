import java.util.Arrays;


public class UnboundedArray<E> {
  private E[] list1,list2;
  int capacity = 1;
  int current_size,beta,alpha,count = 0;
  
  @SuppressWarnings("unchecked")
  public UnboundedArray(int beta, int alpha) {
    this.alpha = alpha;
    this.beta = beta;
    list1 =(E[])new Object[capacity];
    current_size = 0;
  }
  
  public void pushBack(E e)
  {
    if (current_size == capacity) {
      if (count == 0) 
        System.out.print(getSize() + ",");
      capacity = current_size * beta;
      
      list2 = (E[]) new Object[capacity];
      
      for (int i = 0; i < current_size; i++)
        list2[i] = list1[i];
      
      list1 = list2;

      list1[current_size] = e;
      current_size++;
      count++;
      if (count == 1)
        System.out.print(getSize());
      else
        System.out.print("," + getSize());
    }
   
    else {
      if (count == 0) 
     System.out.print(getSize());
     list1[current_size] = e;
     current_size++;
     count++;
    }
    
    
    
  }
  
  @SuppressWarnings("unchecked")
  public void popBack() {
    //@SuppressWarnings("unused")
    if (current_size > 0) { 
      
      list1[list1.length- 1] = null;
      current_size--;
      count--;
      if (((alpha * current_size) <=  capacity) && (current_size > 0)) {
        
        capacity = current_size * beta ;
  
        list2 = (E[]) new Object[capacity];

        
        for (int i = 0; i < current_size; i++)
          list2[i] = list1[i];
        
        list1 = list2;
          
        System.out.print("," + getSize()); 
      }
    }
       
  }
  
  public int getSize() {
    return capacity;
  }
 }
