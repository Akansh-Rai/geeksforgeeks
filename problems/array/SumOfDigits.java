/**
 * 
 */
package geeksforgeeks.problems.array;

/**
 * @author Akansh_Rai
 *         https://www.geeksforgeeks.org/oyo-interview-experience-sde-2/
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3, sum = 4;
		System.out.println(finalCount(n, sum));

	}

	private static int finalCount(int n, int sum) {
		int result = 0;
		for (int i = 1; i < 9; i++) {
			if (sum - i >= 0) {
				result += countRecursion(n - 1, sum - i);
			}
		}

		return result;
	}

	private static int countRecursion(int n, int sum) {
		// base case if n = 0 and sum == 0 then got one pair
		if (n == 0)
			return (sum == 0) ? 1 : 0;
		
		if (sum == 0) 
            return 1;

		// Initialize answer
		int result = 0;

		for (int i = 0; i <= 9; i++) {
			if (sum - i >= 0)
				result += countRecursion(n - 1, sum - i);
		}
		return result;
	}

}
