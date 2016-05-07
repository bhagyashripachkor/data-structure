
public class SelectionSort {
	public static void main(String args[]){
		int[] array = {2,7,4,1,5,3};
		int len = array.length;
		selection(array,len);
	}

	private static void selection(int[] array, int len) {
		// TODO Auto-generated method stub
		int i_min = 0;
		for(int i = 0; i < len-1; i++) {
			i_min = i;
			for(int j = i + 1; j < len; j++){
				if(array[j] < array[i_min])
					i_min = j;
			}
			int temp = array[i];
			array[i] = array[i_min];
			array[i_min] = temp;
		}
		
		for(int i = 0; i < len; i++)
			System.out.print(array[i]+" ");
		
	}
}
