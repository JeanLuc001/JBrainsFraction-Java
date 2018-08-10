package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddFractionsTest
{
	/**
	 * Dieser Test hat kein "Warum", aber ein "Was" (0+0=0)
	 */
	@Test
	public void zerosPlusZeros() throws Exception
	{
		Fraction sum = new Fraction(0).plus(new Fraction(0));
		assertEquals(0, sum.intValue());
	}

	@Test
	public void nonZeroPlusZero() throws Exception
	{
		Fraction sum = new Fraction(3).plus(new Fraction(0));
		assertEquals(3, sum.intValue());
	}
}