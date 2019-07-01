package com.stackroute.junitdemo3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix m;
    @Before
    public void setUp() {
        m = new Matrix();
    }
    @After
    public void tearDown(){
        m=null;
    }

        @Test
        public void testmatrix1()
        {
            int[][] res=m.Sum(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
    assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},res);


    }
    @Test
    public void testmatrix2()
    {
        int[][] res=m.Sum(2,2,new int[][]{{10,20},{3,4}},new int[][]{{10,8},{7,6},{5,4}});
        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},res);


    }


}