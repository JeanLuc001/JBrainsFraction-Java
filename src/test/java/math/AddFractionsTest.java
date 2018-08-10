package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddFractionsTest
{
	/**
	 * Dieser Test hat kein "Warum", aber ein "Was" (0+0=0) Frage: Ist das
	 * WIRKLICH einfacher, intValue() statt numerator() abzufragen? Ich WEISS
	 * doch, dass es um Brueche geht. Ist es ausserdem angemessen, Fraction mit
	 * nur EINEM Wert statt zwei Werten zu instanziieren, wie ich es als User
	 * von Breuchen erwarten wuerde (es gibt numerator und denominator)? Diese
	 * Art von Test widerspricht sich selbst: Die Klasse Fraction gibt gemaess
	 * ihres Namens vor, ein Bruch zu sein, sieht aber mit ihrer
	 * intValue()-Methode und ihrem Konstuktor aus wie ein Integer oder eine
	 * Number. Das macht das Verstaendnis doch nicht wirklich einfacher, oder?
	 */
	@Test
	public void zerosPlusZeros() throws Exception
	{
		Fraction sum = new Fraction(0).plus(new Fraction(0));
		assertEquals(0, sum.intValue());
	}

	/**
	 * nonZeroPlusZero statt threePlusZero, weil die Bedeutung "three" nicht
	 * klar wuerde. Frage: ginge auch
	 * whenAddingZeroToNonZeroThenExpectCorrectResult()? Zu Wort gewaltig? Aber
	 * given-when-then konform!
	 */
	@Test
	public void nonZeroPlusZero() throws Exception
	{
		Fraction sum = new Fraction(3).plus(new Fraction(0));
		assertEquals(3, sum.intValue());
	}

	@Test
	public void zeroPlusNonZero() throws Exception
	{
		Fraction sum = new Fraction(0).plus(new Fraction(5));
		assertEquals(5, sum.intValue());
	}

	@Test
	public void nonNegativeNonZeroOperands() throws Exception
	{
		Fraction sum = new Fraction(3).plus(new Fraction(4));
		assertEquals(7, sum.intValue());
	}

	@Test
	public void negativeInputsAndNegativeOutput() throws Exception
	{
		Fraction sum = new Fraction(-3).plus(new Fraction(1));
		assertEquals(-2, sum.intValue());
	}
}