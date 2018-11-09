package console;


public class IneterestingRow {
    static void interestingRow(int[] array, int base) {

        for (int i = 0; i < array.length; i++) {
            if (i == base)
                System.out.println("Your element is " + array[i]);
        }

    }
}
