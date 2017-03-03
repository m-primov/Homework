
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 7, 9, 13, 21, 44, 56, 123};
		int x = 0;
		int index = binarySearch(arr, x, 0, arr.length - 1);
		System.out.println(index);
	}
	
	static int binarySearch(int[] arr, int x, int start, int end) {
		if (start > end) {
			return -1;
		}
		// Step 1 find mid element
		int midIndex = (start + end) / 2;
		// Step 2 compare x with element on mid index
		// if x == arr[midIndex] return midIndex
		if (x == arr[midIndex]) {
			return midIndex;
		}
		// if not:
			// if x > arr[midIndex] - call the same method with new start = midIndex + 1 and new end = old end
			// if x < arr[midIndex] - call the same method with new start = old end and new end = midIndex - 1
		if (x > arr[midIndex]) {
			return binarySearch(arr, x, midIndex + 1, end);
		}
		
		return binarySearch(arr, x, start, midIndex - 1);
		// Step 2 call method binarySearch recursive
	}

}
