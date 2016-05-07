
public class BubbleSort {
	public static void main(String args[]){
		int[] array = {2,7,4,1,5,3};
		int len = array.length;
		bubble(array,len);
	}

	private static void bubble(int[] array, int len) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int c = 0; c <  len - 1 ; c++) {
			int flag = 0;
		      for (int d = 0; d < len - c - 1; d++){
		        if (array[d] > array[d+1]) /* For descending order use < */
		        {
		          temp       = array[d];
		          array[d]   = array[d+1];
		          array[d+1] = temp;
		          flag = 1;
		        }
		      }
		      if(flag == 0)
		    	  break;
		    }
		
		for(int i = 0; i < len; i++)
			System.out.print(array[i]+" ");
	}
}
