package assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckEvenTest {
    @Test
    public void check_even()throws IllegalArgumentException{
        CheckEven x=new CheckEven();


        assertEquals("The number is odd",x.Even(5));
        assertEquals("The number is even",x.Even(10));
        assertEquals("The number is even",x.Even(6));
        assertEquals("The number is odd",x.Even(15));
    }


}