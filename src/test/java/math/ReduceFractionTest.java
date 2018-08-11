package math;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReduceFractionTest
{
	/**
	 * Bereits in FractionEqualsTest; hier nochmal eingefuegt zum Zwecke der
	 * Vollstaendigkeit ([V4,10:15]).
	 */
	@Test
	public void alreadyInLowestTerms() throws Exception
	{
		assertEquals(new Fraction(3, 4), new Fraction(3, 4));
	}
	
	@Test
	@Ignore("waiting to implement gcd()")
	public void reduceToNotWholeNumber() throws Exception
	{
		assertEquals(new Fraction(3, 4), new Fraction(6, 8));
	}
}