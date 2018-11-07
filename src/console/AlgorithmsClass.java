package console;

public class AlgorithmsClass {

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
