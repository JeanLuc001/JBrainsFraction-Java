package math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Motivation fuer die Namensgebungen ([V1]):<br>
 * Jede Methode stellt einen Spezialfall des zu testenden Verhaltens ("adding
 * fractions") von der Testliste dar ([V1,2:00]). In diesem Fall, wo es EIN
 * Verhalten gibt, das mittels diverser SPEZIALFAELLE (eine Methode pro Fall)
 * getestet wird, wird die Testklasse nicht nach der zu testenden Klasse benannt
 * (z.B. FractionTest), sondern nach dem zu implementierenden Verhalten, um
 * nicht durch die Testklasse implizit bereits die Struktur der Loesung
 * vorzugeben ([V1,1:00]).<br>
 * Jede Methode wird nach dem zu testenden Spezialfall benannt; aber immer noch
 * relativ allgemein: Z.B. wird nicht add3To5() getesetet, sondern besser
 * addNonNegativeToNonNegative(), weil man sonst eine Signifikanz / Bedeutung
 * hinter den Zahlen 3 und 5 suggerieren wuerde ?!
 */
public class AddFractionsTest
{
	/**
	 * 1. Test <br>
	 * "Kernel-Test" (=simpelster Spezialfall)<br>
	 * <br>
	 * Dieser Test hat kein "Warum" (warum ist dieser Fall ein Spezialfall?),
	 * aber ein "Was" (0+0=0) <br>
	 * <br>
	 * Frage: Ist das WIRKLICH einfacher, intValue() statt numerator()
	 * abzufragen? Ich WEISS doch, dass es um Brueche geht. Ist es ausserdem
	 * angemessen, Fraction mit nur EINEM Wert statt zwei Werten zu
	 * instanziieren, wie ich es als User von Breuchen erwarten wuerde (es gibt
	 * numerator und denominator)? Diese Art von Test widerspricht sich selbst:
	 * Die Klasse Fraction gibt gemaess ihres Namens vor, ein Bruch zu sein,
	 * sieht aber mit ihrer intValue()-Methode und ihrem Konstuktor aus wie ein
	 * Integer oder eine Number. Das macht das Verstaendnis doch nicht wirklich
	 * einfacher, oder?
	 */
	@Test
	public void zerosPlusZeros() throws Exception
	{
		checkAddFractionsAsIntegers(0, 0, 0);
	}

	private void checkAddFractionsAsIntegers(int addend, int augend, int expectedResult)
	{
		assertEquals(expectedResult, new Fraction(addend).plus(new Fraction(augend)).intValue());
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
		checkAddFractionsAsIntegers(3, 0, 3);
	}

	@Test
	public void zeroPlusNonZero() throws Exception
	{
		checkAddFractionsAsIntegers(5, 0, 5);
	}

	/**
	 * Inlining ist Geschmackssache [V1,25:00]. Duplicate Code in den einzelnen
	 * Tests ein Hinweis darauf, dass wir frueher oder speater den Vergleich von
	 * intValue() mit einer equals()-Implementierung ersetzen [V125:00]
	 */
	@Test
	public void nonNegativeNonZeroOperands() throws Exception
	{
		checkAddFractionsAsIntegers(3, 4, 7);
	}

	@Test
	public void negativeInputsAndNegativeOutput() throws Exception
	{
		checkAddFractionsAsIntegers(-3, 1, -2);
	}

	@Test
	public void nonTrivialButCommonDenominator() throws Exception
	{
		assertEquals(new Fraction(3, 5), new Fraction(1, 5).plus(new Fraction(2, 5)));
	}
}