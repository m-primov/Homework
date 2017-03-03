
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrToSort = {4, 8, 6, 5, 2, 5, 1, 8, 6, 5, 2, 5, 1};
		System.out.println("Dyljina na masiva = " + arrToSort.length);
		bubbleSort(arrToSort);
		System.out.print("[");
		for (int i = 0; i < arrToSort.length; i++) {
			if (i == arrToSort.length - 1) {
				System.out.print(arrToSort[i] + "]");
			} else {
				System.out.print(arrToSort[i] + ", ");
			}
		}
	}
	
	static void bubbleSort(int[] arr) {
		// check first with second, swap if first > second
		// check second with third, swap if second > third
		// ... do n times
		int counter = 0;
		for (int k = 0; k < arr.length; k++) {
			boolean isSwapped = false;
			// optimization do to arr.length - 1 - k
			for (int i = 0; i < arr.length - 1 - k; i++) {
				counter++;
				if (arr[i] < arr[i + 1]) {
					isSwapped = true;
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
		System.out.println("Broi operacii = " + counter);
	}

}
