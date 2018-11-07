package console;

import java.util.Scanner;

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
	
// Methods for Case 14
    
    public static void start14() {
    	boolean done14 = true;
        while (done14) {
            try {
            	Scanner innerScan14 = new Scanner(System.in);
            	
            	System.out.println("Enter the number of posts:");
        		int n = innerScan14.nextInt();
        		
        		System.out.println("Enter the number of colors:");
        		int k = innerScan14.nextInt();
        		
        		System.out.println("The number of ways of painting the fence is " + AlgorithmsClass.numWays(n, k) + ". \n");
                done14 = false;
            } catch (Exception e) {
                System.out.println("You entered the wrong number \n");
            }
        }
    }
    
    public static long numWays(int n, int k) {
		if (n <= 0 || k <= 0) {
			throw  new IllegalArgumentException();
		}

		if (n == 1) {
			return k;
		}

		int[] dp1 = new int[n];
		int[] dp2 = new int[n];

		dp1[0] = 0;
		dp2[0] = k;

		for (int i = 1; i < n; i++) {
			dp1[i] = dp2[i - 1];
			dp2[i] = (k - 1) * (dp1[i - 1] + dp2[i - 1]);
		}
		
		long sum = dp1[n - 1] + dp2[n - 1];
		
		return sum;
	}
    // The end of methods for Case 14
}
