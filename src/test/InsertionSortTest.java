import console.InsertionSort;
import console.Sort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {


    Sort sort;
    int[] before;
    int[] sorted;

    @Before
    public void setUp() throws Exception {
        before = new int[1000];
        for (int i = 0; i < before.length; i++) {
            before[i] = (int) Math.random()*1000;
        }
        sorted = Arrays.copyOf(before, before.length);
        Arrays.sort(sorted);
        sort = new InsertionSort();
    }

    @Test
    public void sort() {
        assertArrayEquals(sorted, sort.sort(before));
    }

}