/**
 * 
 */
package geeksforgeeks.problems.array;

/**
 * @author Akansh_Rai
 *         https://www.geeksforgeeks.org/oyo-interview-experience-sde-2/
 */
public class SumOfDigitsDP {
	static int lookup[][] = new int[10][10];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3, sum = 5;
		System.out.println(finalCount(n, sum));

	}

	private static int finalCount(int n, int sum) {
		// Initialize all entries of lookup table
		for (int i = 0; i <= 9; ++i) {
			for (int j = 0; j <= 9; ++j) {
				lookup[i][j] = -1;
			}
		}

		// Initialize final answer
		int result = 0;

		// Traverse through every digit from 1 to
		// 9 and count numbers beginning with it
		for (int i = 1; i <= 9; i++)
			if (sum - i >= 0)
				result += countRecursion(n - 1, sum - i);
		return result;
	}

	private static int countRecursion(int n, int sum) {
		// Base case
		if (n == 0)
			return sum == 0 ? 1 : 0;

		// If this subproblem is already evaluated,
		// return the evaluated value
		if (lookup[n][sum] != -1)
			return lookup[n][sum];

		// Initialize answer
		int ans = 0;

		// Traverse through every digit and
		// recursively count numbers beginning
		// with it
		for (int i = 0; i < 10; i++)
			if (sum - i >= 0)
				ans += countRecursion(n - 1, sum - i);

		return lookup[n][sum] = ans;
	}

}
