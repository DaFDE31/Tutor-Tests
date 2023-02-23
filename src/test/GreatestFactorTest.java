package test;

import main.Greatest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestFactorTest {
    @Test
    public void GMT(){
        int expected = 15;
        Greatest test = new Greatest();
        int actual = test.Greatest_Multiple2(new int[]{12,15,17,5}, 5);
        Assertions.assertEquals(expected, actual);

        expected = 1;
        actual = test.Greatest_Multiple2(new int[]{1,2,3,4,5}, 6);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void GFT(){

    }
}
