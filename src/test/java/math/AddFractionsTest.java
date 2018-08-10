package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddFractionsTest
{
	/**
	 * Dieser Test hat kein "Warum", aber ein "Was"
	 */
	@Test
	public void zerosPlusZeros() throws Exception
	{
		Fraction sum = new Fraction(0).plus(new Fraction(0));
		assertEquals(0, sum.intValue());
	}
}