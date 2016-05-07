
public class InsertionSort {
	public static void main(String args[]){
		int[] array = {2,7,4,1,5,3};
		int len = array.length;
		insertion(array,len);
	}

	private static void insertion(int[] array, int len) {
		// TODO Auto-generated method stub
		int value,hole;
		for(int i = 0; i < len;i++){
			value = array[i];
			hole= i;
			while(hole > 0 && array[hole-1] > value){
				array[hole] = array[hole-1];
				hole = hole - 1;
			}
			array[hole] = value;
		}
		for(int i = 0; i < len; i++)
			System.out.print(array[i]+" ");
	}
}
