
public class CountingSort {
	public static void main(String[] args) {
		//int[] arrToSort = {3, 1, 1, 2, 1, 3, 2, 3, 2, 1};
		int[] arrToSort = {1105, 1109, 1106, 1108};
		countingSort(arrToSort);
		
		for (int i = 0; i < arrToSort.length; i++) {
			System.out.print(arrToSort[i] + " ");
		}
		
	}
	
	static void countingSort(int[] arr) {
		// find max element in array
		int maxElement = arr[0];
		int minElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
			if (arr[i] < minElement) {
				arr[i] = minElement;
			}
		}
		// create array with length - max element + 1
		// optimization maxElement - minElement
		int[] helper = new int[maxElement - minElement + 1];
		// find the numbers of encounter of every element
		for (int i = 0; i < arr.length; i++) {
			//int index = arr[i];
			int index = maxElement - arr[i];
			helper[index]++;
		}

		int currentIndex = 0;
		// fill the array arr with the values from helper
		for (int i = 0; i < helper.length; i++) {
			int counter = helper[i];
			for (int j = 0; j < counter; j++) {
				//arr[currentIndex] = i;
				arr[currentIndex] = minElement + i;
				currentIndex++;
			}
		}
	}
}
