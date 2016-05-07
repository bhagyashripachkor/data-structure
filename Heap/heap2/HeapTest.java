
public class HeapTest {
  public static void main(String[] args) {
    int array[] = { 3, 2, 1, 7, 8, 4, 10, 16, 12 };
    System.out.print("Original Array : ");
    for (int i = 0; i < array.length; i++) {
        System.out.print("  " + array[i]);
    }
    MinHeap m = new MinHeap(array.length);
    System.out.print("\nMin-Heap : ");
    m.insert(array);
    m.display();
    m.delete(7);
    System.out.println("After deleting 7");
    m.display();
    System.out.println("After sorting");
    m.sort();
    m.display();
}
}
