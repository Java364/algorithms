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
	//Methods for Case 6
	static int WaysToWriteNAsSumOfTwoOrMorePositiveIntegers(int N) {
        //The goal: To find in how many ways is possible to calculate n with positive integers.
        int solutions[] = new int[N + 1];

       for(int i=0;i<N;i++){
           solutions[i]=0;
       }

        solutions[0] = 1;

        for (int i = 1; i < N; i++)
            for (int j = i; j <= N; j++)
                solutions[j] += solutions[j - i];

        return solutions[N];
    }
	//The end of methods for Case 6
	
	//Methods for Case 9
	
		public static void start9() {
			boolean done9 = true;
	    	while(done9) {
	    		try {
	    			Scanner innerScan9 = new Scanner(System.in);
	    			System.out.println("Enter the number of days you have the tasks for:");
	        		int num = innerScan9.nextInt();
	        		if (num < 1) {
	        			throw new IllegalArgumentException();
	        		}
	        		int high[] = new int[num];
	        		int low[] = new int[num];
	        		for (int i = 0; i < high.length; i++) {
	        			System.out.println("choose the task for the day " + (i + 1) + ":");
	        			int one = innerScan9.nextInt();
	        			if(one < 0) {
	        				throw new IllegalArgumentException();
	        			}
	        			System.out.println("choose the another task for the day " + (i + 1) + ":");
	        			int two = innerScan9.nextInt();
	        			if(two < 0) {
	        				throw new IllegalArgumentException();
	        			}
	        			if (one > two) {
	        				high[i] = one;
	        				low[i] = two;
	        			} else {
	        				high[i] = two;
	        				low[i] = one;
	        			}
	        		}
	        		System.out.println("This is your optimal quantity of job: "
	        				+ AlgorithmsClass.maxTasks(high, low, num) + "\n");
	        		done9 = false;
				} catch (Exception e) {
					System.out.println("You entered the wrong number");
				}
	    	}
		}
		
		public static int maxTasks(int high[], int low[], int n) {

			int task_dp[] = new int[n + 1];
			task_dp[0] = 0;
			task_dp[1] = high[0];

			for (int i = 2; i <= n; i++)
				task_dp[i] = max(high[i - 1] + task_dp[i - 2], low[i - 1]
						+ task_dp[i - 1]);
			return task_dp[n];
		}

		public static int max(int x, int y) {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		}
		// The END of methods for Case 9

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
    
