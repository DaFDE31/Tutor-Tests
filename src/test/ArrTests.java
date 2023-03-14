package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.ArrayPractice;

public class ArrTests {
    ArrayPractice subject = new ArrayPractice();
    @Test
    public void Test1(){
        int [] expected = new int[10];
        int [] actual = subject.makeArray();
        Assertions.assertEquals(expected.length, actual.length);
    }

    @Test
    public void Test2(){
        int [] expected = new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] actual = subject.makeArray(10);
        Assertions.assertEquals(expected, actual);
        expected = new int[]{1,2,3,4,5,6,7,8,9,10};
        actual = subject.makeArray(5);
        Assertions.assertEquals(expected, actual, "AHHHHHHHHH");
    }

    @Test
    public void Test3(){
        //EX: [["Danielson", "Adjocy"],["Sameer","Patel"]]-> DA SP
        String expected = "DA SP";

        String [][] names = new String[][]{new String[]{"Danielson", "Adjocy"}, new String[]{"Sameer", "Patel"}};
        String actual = subject.initials(names);
        Assertions.assertEquals(expected, actual);
        expected = "EW LD";
        names = new String[][]{new String[]{"Elijah", "Wallace"}, new String[]{"Layla", "Davis"}};
        Assertions.assertEquals(expected, actual);
    }




}
