package math;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Das ist KEIN TDD. Es geht darum, equals() technisch korrekt zu
 * implementieren!
 *
 */
public class FractionEqualsTest
{
	@Test
	public void sameNumeratorAndDenominator() throws Exception
	{
		assertEquals(new Fraction(3, 5), new Fraction(3, 5));
	}

	@Test
	public void differentNumerators() throws Exception
	{
		assertNotEquals(new Fraction(3, 5), new Fraction(2, 5));
	}

	@Test
	public void differentDenominators() throws Exception
	{
		assertNotEquals(new Fraction(3, 7), new Fraction(3, 5));
	}

	@Test
	public void wholeNumberEqualsSameFraction() throws Exception
	{
		assertEquals(new Fraction(5, 1), new Fraction(5));
	}

	@Test
	public void wholeNumberNotEqualsDifferentWholwFraction() throws Exception
	{
		assertNotEquals(new Fraction(6), new Fraction(5));
	}

	@Test
	public void negativeDenominator() throws Exception
	{
		assertEquals(new Fraction(1, 2), new Fraction(-1, -2));
		assertEquals(new Fraction(-1, 2), new Fraction(1, -2));
	}
}