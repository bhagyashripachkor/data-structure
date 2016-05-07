
public class MinHeap {

  
  public int size;
  int ele;
  public int[] heap;
  public int position;
  int count = 0;
  public MinHeap() {
      heap = new int[100];
      position = 0;
  }

  public void display() {
      for (int i = 1; i <= size; i++) {
        if (count == 0) {
          System.out.print(heap[i]);
        }
        else {
          System.out.print(heap[i] + " ");
        }
        count++;
      }
      System.out.println("");
  }

  public void insert(int x) {
      if (position == 0) { 
        //root
          heap[position + 1] = x; 
          position = 2;
      } else {
        //end
          heap[position++] = x; 
          bubbleUp(); 
      }
      size++;
  }

  public void bubbleUp() {
    //last
      int pos = position - 1; 
      //root >
      while (pos > 0 && heap[pos / 2] > heap[pos]) { 
          int y = heap[pos];
          heap[pos] = heap[pos / 2];
          heap[pos / 2] = y;
          pos = pos / 2; 
      }
  }

  public void extract_min() {
      int min = heap[1]; 
      //root = last
      if (min != 0) {
      heap[1] = heap[position - 1]; 
      heap[position - 1] = 0; 
      position--; 
      heapify(1); 
      }
      size--;
  }
  
  public void heapify(int k) {
      int a = heap[k];
      int smallest = k;
      // check which is smaller child , 2k or 2k+1.
      if (parent(k) < position && heap[smallest] > heap[parent(k)]) {
          smallest = parent(k);
      }
      if (leftChild(k) < position && heap[smallest] > heap[leftChild(k)]) {
          smallest = leftChild(k);
      }
      if (smallest != k) { 
          swap(k, smallest);
          heapify(smallest); 
      }

  }
  
  public void swap(int a, int b) {
     
      int temp = heap[a];
      heap[a] = heap[b];
      heap[b] = temp;
  }
  
  public int parent(int k) {
    return 2 * k ;
  }
  
  public int leftChild(int k) {
    return (2 * k + 1);
  }
  
  public int rightChild(int k) {
    return (2 * k + 2);
  }

 public void modify(int pos, int ele) {
   
        heap[pos] = ele;
        heapify(1);
  }
}