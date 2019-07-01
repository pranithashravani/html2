package com.stackroute.junitdemo3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {
    Chess ch;
    @Before
    public void setup()
    {
        ch=new Chess();
    }
    @Test
    public void testchess()
    {
        String expect[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] result = ch.boardDisplay(2,8);

        assertArrayEquals(expect,result);
    }
    @Test
    public void testchessInput()
    {
        String expect[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] result = ch.boardDisplay(8,8);

        assertArrayEquals(expect,result);
    }
    @Test
    public void testchess1()
    {
        String expect[][]={};

        String [][] result = ch.boardDisplay(0,0);

        assertArrayEquals(expect,result);
    }

}