package test;

import main.Grok;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class Grok_Test {
    @Test
    public void NullConstructorTest(){
        Grok test = new Grok();
        int expected = 50;
        int actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ConstructorTest(){
        Grok test = new Grok(20);
        int expected = 20;
        int actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void DeadTest(){
        Grok test = new Grok(20);
        Assertions.assertFalse(test.isDead());
        test.setPowerSupply(0);
        Assertions.assertTrue(test.isDead());
        test.setPowerSupply(50);
        Assertions.assertTrue(test.isDead());
    }
    @Test
    public void SetTest(){
        Grok test = new Grok(20);
        test.setPowerSupply(60);
        int expected = 60;
        int actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);

        test.setPowerSupply(1000);
        expected = 100;
        actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);

        test.setPowerSupply(-20);
        expected = 0;
        actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);

        test.setPowerSupply(20);
        actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TookTest(){
        Grok test = new Grok(6);
        test.tookHit();
        int expected = 1;
        int actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);
        test.tookHit();
        expected = 0;
        actual = test.getPowerSupply();
        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(test.isDead());
    }
}
