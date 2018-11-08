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
            throw  new IllegalArgumentException();
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
}
