package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatestCommonDivisorTest
{
	@Test
	public void oneAndOne() throws Exception
	{
		assertEquals(1, gcd(1, 1));
	}

	private int gcd(int a, int b)
	{
		while (b != 0)
		{
			int t = b;
			b = a % t;
			a = t;
		}
		return a;
	}
}