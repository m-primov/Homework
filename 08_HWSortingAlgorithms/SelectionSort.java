
public class SelectionSort {

	public static void main(String[] args) {
		int[] arrToSort = {4, 8, 6, 5, 2, 5, 1, 8, 6, 5, 2, 5, 1};
		System.out.println("Dyljina na masiva = " + arrToSort.length);
		selectionSort(arrToSort);
		System.out.print("[");
		for (int i = 0; i < arrToSort.length; i++) {
			if (i == arrToSort.length - 1) {
				System.out.print(arrToSort[i] + "]");
			} else {
				System.out.print(arrToSort[i] + ", ");
			}
		}

	}

	static void selectionSort(int[] arr) {
		// find minIndex
		// swap minIndex with second
		// ...
		int counter = 0;
		for (int k = 0; k < arr.length / 2; k++) {
			// find minIndex
			int minIndex = k;
			// find maxIndex
			int maxIndex = k;
			for (int i = k + 1; i < arr.length - k; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
				if (arr[maxIndex] < arr[i]) {
					maxIndex = i;
				}
				counter++;
			}
			
			
			// swap minIndex with first
			int temp = arr[minIndex];
			arr[minIndex] = arr[k];
			arr[k] = temp;
			
			if (maxIndex == k) {
				maxIndex = minIndex;
			}
			
			// swap maxIndex with the last and previous and so on
			int temp2 = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = arr[maxIndex];
			arr[maxIndex] = temp2;
		}

		System.out.println("Broi operacii = " + counter);
	}
}
