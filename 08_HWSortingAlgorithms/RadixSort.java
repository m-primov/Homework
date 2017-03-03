import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = radixSort(new int[] {3213, 1322, 123, 221, 9731, 233, 92, 23, 9, 85181});
		System.out.println(Arrays.toString(result));
	}

	static int[] radixSort(int[] nums) {
		// Find max number of digits
		int maxDigits = getNumOfDigits(getMaxNum(nums));
		
		// Sorting all digits
		for (int digit = 1; digit <= maxDigits; digit++) {
			nums = countingSort(nums, digit);
		}
		
		return nums;
	}
	
	static int kthDigit(int num, int k) {
		int tenOnKth = (int) Math.pow(10, k - 1);
		return (num / 10) % 10;
	}
	
	static int[] countingSort(int nums[], int digit) {
		int[] numbersCount = new int[10];
		int[] result = new int[nums.length];
		
		for (int index = 0; index < nums.length; index++) {
			int num = kthDigit(nums[index], digit);
			numbersCount[num]++;
		}
		
		for (int index = 1; index < numbersCount.length; index++) {
			numbersCount[index] += numbersCount[index - 1];
		}
		
		for (int index = nums.length - 1; index >= 0; index--) {
			int num = nums[index];
			int numDigit = kthDigit(num, digit);
			numbersCount[numDigit]--;
			int pos = numbersCount[numDigit];
			result[pos] = num;
		}
		
		return result;
	}
	
	// Return the biggest element in the array
	static int getMaxNum(int nums[]) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		return max;
	}
	
	// Return the number of digits
	static int getNumOfDigits (int num) {
		int digitCount = 0;
		while (num > 0) {
			num /= 10;
			digitCount++;
		}
		
		return digitCount;
	}
}
