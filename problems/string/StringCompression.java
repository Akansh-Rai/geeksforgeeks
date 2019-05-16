/**
 * 
 */
package geeksforgeeks.problems.string;

/**
 * @author Akansh_Rai
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aabbcccd";
		System.out.println("input : " + compressString(str));
		str = "wwwwaaadexxxxxxywww";
		System.out.println("input : " + compressString(str));
	}

	private static String compressString(String input) {
		if (input == null || input.length() <=1) return input;
		
		StringBuffer result = new StringBuffer();
		int i = 1;
		int count = 1;
		while (i < input.length()) {
			if (input.charAt(i-1) == input.charAt(i)) {
				count++;
			} else {
				appendInResult(input, result, i, count);
				count = 1;
			}
			i++;
		}
		
		appendInResult(input, result, i, count);
		
		return result.toString();
	}

	private static void appendInResult(String input, StringBuffer result, int i, int count) {
		result.append(""+input.charAt(i-1));
		if (count > 1) result.append(""+count);
	}

}
