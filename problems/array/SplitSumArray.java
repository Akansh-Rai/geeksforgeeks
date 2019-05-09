/**
 * 
 */
package geeksforgeeks.problems.array;

/**
 * @author Akansh_Rai
 *
 *         https://www.geeksforgeeks.org/split-array-two-equal-sum-subarrays/
 */
public class SplitSumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5 };
		printTwoParts(arr);
	}

	private static void printTwoParts(int[] arr) {
		int splitPoint = findSplitPoint(arr);
		if (splitPoint == -1) {
			System.out.println("Point not found in given array");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i == splitPoint) {
					System.out.println("");
				}
				System.out.print(arr[i] +" ,");
				
			}
		}
	}

	private static int findSplitPoint(int[] arr) {
		int returnPoint = -1;
		int left = 1;
		int right = arr.length-2;
		int leftSum = arr[0];
		int rightSum = arr[right+1];
		
		while(left <= right) {
			if (leftSum <= rightSum) {
				leftSum += arr[left++];
			} else  {
				rightSum += arr[right--];
			} 
		}
		if (leftSum == rightSum) {
			return leftSum;
		}
		return returnPoint;
	}

}
