package pucrs.qp.distance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest
{
	@Test
    public void testDistance1()
    {
        int actual = App.calcDistance(30);
        int expected = 60;
        assertEquals(expected, actual);
    }
	@Test
    public void testDistance2()
    {
        int actual = App.calcDistance(110);
        int expected = 220;
        assertEquals(expected, actual);
    }
	@Test
    public void testDistance3()
    {
        int actual = App.calcDistance(7);
        int expected = 14;
        assertEquals(expected, actual);
    }
	@Test
    public void testInvalid()
    {
        int actual = App.calcDistance(-67);
        int expected = Distance.INVALID;
        assertEquals(expected, actual);
    }

}









