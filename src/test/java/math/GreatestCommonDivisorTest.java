package math;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Der Sinn dieser Klasse ist nicht TDD, sondern sicherzustellen, dass wir die
 * gcd()-Methode, kopiert von Wikipedia, richtig implementieren.<br>
 * Daher sind die Methoden keine TDD-Tests, sondern eher Beispiele und
 * beinhalten u.U. mehrere Asserts.
 *
 */
public class GreatestCommonDivisorTest
{
	@Test
	public void reflexive() throws Exception
	{
		assertEquals(1, NumberTheory.gcd(1, 1));
		assertEquals(2, NumberTheory.gcd(2, 2));
		assertEquals(1, NumberTheory.gcd(-1, -1));
	}

	@Test
	public void testName() throws Exception
	{
		assertEquals(1, NumberTheory.gcd(2, 3));
		assertEquals(1, NumberTheory.gcd(4, 7));
		assertEquals(1, NumberTheory.gcd(-2, -3));
	}

	@Test
	public void oneIsMultipleOfTheOther() throws Exception
	{
		assertEquals(3, NumberTheory.gcd(3, 9));
		assertEquals(5, NumberTheory.gcd(5, 30));
	}
	
	@Test
	public void commonFactor() throws Exception
	{
		assertEquals(2, NumberTheory.gcd(6, 8));
		assertEquals(7, NumberTheory.gcd(49, 315));
		assertEquals(4, NumberTheory.gcd(-24, -28));
		assertEquals(4, NumberTheory.gcd(-24, 28));
	}
	
	@Test
	public void negatives() throws Exception
	{
		// Do I like this behaviour of the standard algo?
		// Probably prefer gcd > 0
		assertEquals(4, NumberTheory.gcd(-24, -28));
		assertEquals(4, NumberTheory.gcd(-24, 28));
	}
}