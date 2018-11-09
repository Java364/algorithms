package console;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmsClassTest {



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void countWaysToTileTheFloor1() {
        assertEquals(1, AlgorithmsClass.countWaysToTileTheFloor(2, 3));
    }

    @Test
    public void countWaysToTileTheFloor2() {
        assertEquals(2,  AlgorithmsClass.countWaysToTileTheFloor(4, 4));
    }


    @Test (expected = IllegalArgumentException.class)
    public void countWaysToTileTheFloorExceptionHandlingWithWrongN() {
        AlgorithmsClass.countWaysToTileTheFloor(0, 2);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void countWaysToTileTheFloorExceptionHandlingWithWrongM() {
        AlgorithmsClass.countWaysToTileTheFloor(2, 1);
    }
}