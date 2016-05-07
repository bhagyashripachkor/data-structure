
public class MinHeap {
  public int size;
  public int[] heap;
  public int[] elements;
  public int position;
  int index = 0;
  public MinHeap(int size) {
      this.size = size;
      heap = new int[size + 1]; 
      position = 0;
  }

  public void insert(int[] array) {
      if (array.length > 0) {
          for (int i = 0; i < array.length; i++) {
              insert(array[i]);
          }
      }
  }

  public void display() {
      for (int i = 1; i < heap.length; i++) {
        if (heap[i] != 0)
          System.out.print(" " + heap[i]);
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

  public int extract_min() {
      int min = heap[1]; 
      //root = last
      if (min != 0) {
      heap[1] = heap[position - 1]; 
      heap[position - 1] = 0; 
      position--; 
      heapify(1); 
      }
      return min;
  }
  
  public void heapify(int k) {
      int a = heap[k];
      int smallest = k;
      // check which is smaller child , 2k or 2k+1.
      if (2 * k < position && heap[smallest] > heap[2 * k]) {
          smallest = 2 * k;
      }
      if (leftChild(k) < position && heap[smallest] > heap[leftChild(k)]) {
          smallest = leftChild(k);
      }
      if (smallest != k) { 
          swap(k, smallest);
          heapify(smallest); 
      }

  }
  
public void sort() {
    int temp;
    elements = new int[heap.length];
    for (int i = 0; i < heap.length - 1; i++) {
      if (heap[i] > heap[i+ 1]) {
        temp = heap[i];
        heap[i] = heap[i + 1];
        heap[i + 1] = temp;
      }
    }  
  }
  public int parent(int k) {
    return (k - 1)/2 ;
  }
  
  public int leftChild(int k) {
    return (2 * k + 1);
  }
  
  public int rightChild(int k) {
    return (2 * k + 2);
  }

  public void swap(int a, int b) {
     
      int temp = heap[a];
      heap[a] = heap[b];
      heap[b] = temp;
  }

 
  public void delete(int x) {
      
      int index = 0;
      for (int i = 1; i < heap.length; i++) {
          if (heap[i] == x) {
              index = i;
              break;
          }
      }
      heap[index] = heap[position - 1];
      heap[position - 1] = 0; 
      position--;
      heapify(index);
  }
}
