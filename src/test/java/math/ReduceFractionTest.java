package math;

import static org.junit.Assert.*;

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
	public void reduceToNotWholeNumber() throws Exception
	{
		assertEquals(new Fraction(3, 4), new Fraction(6, 8));
	}

	/**
	 * Die naechsten beiden Tests duplizieren zwar das getestete Verhalten von
	 * GreatestCommonDivisorTest.java, aber zweck Vollstaendigkeit /
	 * Dokumentation ist das voellig in Ordnung.
	 */
	@Test
	public void reduceToWholeNumber() throws Exception
	{
		assertEquals(new Fraction(6), new Fraction(24, 4));
	}

	@Test
	public void reduceZero() throws Exception
	{
		assertEquals(new Fraction(0), new Fraction(0, 12814));
	}
}