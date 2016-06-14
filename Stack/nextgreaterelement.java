package stack;

public class NSG {
	public static void main(String[] args){
		int[] array = {4,5,2,25};
		int next = -1;
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				if(array[i] < array[j]){
					next = array[j];
					break;
				}
			}
			System.out.println(array[i] + "->"+ next);
			next = -1;
		}
	}
}
