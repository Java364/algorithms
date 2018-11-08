package console;

public class AlgorithmsClass {

	static int waysToCoverIn3StepsAlgorithm(int distance) {
		int[] count = new int[distance + 1];

		// Initialize base values. There is one way to
		// cover 0 and 1 distances and two ways to
		// cover 2 distance
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;

		// Fill the count array in bottom up manner
		for (int i = 3; i <= distance; i++)
			count[i] = count[i - 1] + count[i - 2] + count[i - 3];

		return count[distance];
	}

	public static int countWaysToTileTheFloor(int n, int m) {
		if (m < 2 || n < 1) {
			throw new IllegalArgumentException();
		} else {
			int count[] = new int[n + 1];
			count[0] = 0;
			int i;
			for (i = 1; i <= n; i++) {
				if (i > m)
					count[i] = count[i - 1] + count[i - m];
				else if (i < m)
					count[i] = 1;
				else
					count[i] = 2;
			}
			return count[n];
		}
	}

	public static int longestPalindromeSubseq(String s) {
		int size = s.length();
		int[][] dp = new int[size][size];
		// Strings of length 1 are palindrome of lentgh 1 
		for (int i = size - 1; i >= 0; i--) {
			dp[i][i] = 1;
			for (int j = i + 1; j < size; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[0][size - 1];
	}
	
	public static int WaysToSumToNUsingArrayElementsWithRepetition(int array[], int n) { 
	        int count[] = new int[n + 1]; 
	        count[0] = 1; 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j < array.length; j++) {
	                if (i >= array[j]) 
	                    count[i] += count[i - array[j]]; 
	            }
	        }
	        return count[n];  
	          
	    } 

}
