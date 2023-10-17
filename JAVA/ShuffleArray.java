package array_shuffle;

import java.util.Arrays;
import java.util.Random;
public class ShuffleArray {

	static void generateRandomValues(int arr[], int size) {
		
		Random generate_random =  new Random();
		
		for(int i = size-1; i > 0; i--) {
			int random_value = generate_random.nextInt(size-1);
			int temp = arr[i];
			arr[i] = arr[random_value];
			arr[random_value] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};	// static array input as mentioned in question
		int size = arr.length;
		generateRandomValues(arr, size);
		
	}

}

