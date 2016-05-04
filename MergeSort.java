import java.util.*;
public class MergeSort {
   
    public static void main(String[] args)
    {
      Integer[] array = {30, 20, 10, 5, 6, 99, 1, 15, 65};
      System.out.println("original array");
      System.out.println(Arrays.toString(array));
      sort(array);
      System.out.println("sorted array");
      System.out.println(Arrays.toString(array));
    }

    @SuppressWarnings("rawtypes")
    public static void sort(Comparable [ ] array)
    {
      Comparable[] temp = new Comparable[array.length];
      
      sort(array, temp,  0,  array.length - 1);
    }


    @SuppressWarnings("rawtypes")
    private static <E extends Comparable<E>> void sort(Comparable [ ] a, Comparable [ ] temp, int left, int right)
    {
      if( left < right )
      {
        int middle = (left + right) / 2;
        
        sort(a, temp, left, middle);
        for (int i = 0; i < temp.length; i++)
          System.out.println(temp[i]);
        sort(a, temp, middle + 1, right);
        
        merge(a, temp, left, middle + 1, right);
      }
    }


      @SuppressWarnings({ "rawtypes", "unchecked" })
      private static <E extends Comparable<E>> void merge(Comparable[ ] a, Comparable[ ] temp, int left, int right, int rightHalf )
      {
          int leftHalf = right - 1;
          int k = left;
          int num = rightHalf - left + 1;

          while(left <= leftHalf && right <= rightHalf) {
            
          
              if(a[left].compareTo(a[right]) <= 0)
                  temp[k++] = a[left++];
              else
                  temp[k++] = a[right++];
          }

          while(left <= leftHalf)    // Copy rest of first half
              temp[k++] = a[left++];

          while(right <= rightHalf)  // Copy rest of right half
              temp[k++] = a[right++];

          // Copy temp back
          for(int i = 0; i < num; i++, rightHalf--)
              a[rightHalf] = temp[rightHalf];
      }
   }

