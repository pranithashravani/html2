package com.stackroute.junitdemo3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive cs;
    @Before
        public void setup()
        {
            cs=new Consecutive();
        }

    @Test

        public void testconsecutive()
        {
            boolean result=cs.consecutive("1,2,3,4");
            assertEquals(true,result);
        }
    @Test

    public void testconsecutive1()
    {
        boolean result=cs.consecutive("1,567,10000");
        assertEquals(false,result);
    }
    @Test

    public void testconsecutive2()
    {
        boolean result=cs.consecutive("2");
        assertEquals(false,result);
    }
    @Test

    public void testconsecutive3()
    {
        boolean result=cs.consecutive("0,0,0,0,0");
        assertEquals(false,result);
    }
    @Test

    public void testconsecutive4()
    {
        boolean result=cs.consecutive(" ");
        assertEquals(false,result);
    }


}