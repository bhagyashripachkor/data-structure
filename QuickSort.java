import java.util.Arrays;




public class QuickSort {

    public static <E extends Comparable<E>> void sort(E[] array, int low, int high) {
      
        if (low < high) {
          
            int i = low, j = high;
            E pivot = array[(i + j) / 2];

            do {
              
                while (array[i].compareTo(pivot) < 0) 
                  i++;
                while (pivot.compareTo(array[j]) < 0) 
                  j--;

                if ( i <= j) {
                    E tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            sort(array, low, j);
            sort(array, i, high);
        }
    }

    public static void main(String[] args) {
      
        Integer[] array = {30, 20, 10, 5, 6, 99, 1, 15, 65};
        QuickSort.<Integer> sort(array, 0, array.length-1);
        
        for(Integer i: array) {
            System.out.print(i + " ");
        }

    }
}