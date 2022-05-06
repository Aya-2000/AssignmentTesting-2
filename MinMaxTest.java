package assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MinMaxTest {
    int[] arr1={7,5,4,15,20,9,30,10};
    int[] arr2={15,5,10,125,120,130};
    int[] arr3={250,35,120,110,550,8,5};
    int[] arr4={2,3,1,4,6,10,7};

    @Test
    public void min_max() throws IllegalArgumentException {

        MinMax arr = new MinMax();
        assertEquals(30,arr.Maximum(arr1));
        assertEquals(4,arr.Minimum(arr1));
        assertEquals(130,arr.Maximum(arr2));
        assertEquals(5,arr.Minimum(arr2));
        assertEquals(550,arr.Maximum(arr3));
        assertEquals(5,arr.Minimum(arr3));
        assertEquals(10,arr.Maximum(arr4));
        assertEquals(1,arr.Minimum(arr4));
    }
}