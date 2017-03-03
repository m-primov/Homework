
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 1, 8, 3, 4, 9, 5};
		printArray(arr);
		/*int idx = partition(arr, 0, arr.length - 1);
		System.out.println("idx = " + idx);*/
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
		}
		System.out.println("]");
	}
	
	static void quickSort(int[] arr, int start, int end){
		if (start >= end) {
			return;
		}
		// find pivot from start to end
		// call the same method for the first half of the array(before pivot)
		// call the same method for the second half of the array(after pivot)
		int pivotIdx = partition(arr, start, end);

		printArray(arr);

		quickSort(arr, start, pivotIdx - 1);
		quickSort(arr, pivotIdx + 1, end);
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int idx = start;
		
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		
		int temp = arr[idx];
		arr[idx] = arr[end];
		arr[end] = temp;
		return idx;
	}
}
