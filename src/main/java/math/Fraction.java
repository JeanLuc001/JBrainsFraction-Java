package math;

public class Fraction
{
	private final int numerator;
	private final int denominator;

	public Fraction(int intValue)
	{
		this(intValue, 1);
	}

	public Fraction(int numerator, int denominator)
	{
		int gcd = NumberTheory.gcd(numerator, denominator);
		this.numerator = numerator / gcd ;
		this.denominator = denominator / gcd;
	}

	/**
	 * "micro step":<br>
	 * if-Anweisung, um den neuen Test 'differentDenominators()' (temporaer) von
	 * den alten, funktionierenden Tests, zu separieren.
	 */
	public Fraction plus(Fraction fraction)
	{
		if (denominator != fraction.denominator)
		{
			return new Fraction(numerator * fraction.denominator + fraction.numerator * denominator,
					denominator * fraction.denominator);
		}
		return new Fraction(numerator + fraction.numerator, denominator);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		return denominator == other.denominator && numerator == other.numerator;
	}

	@Override
	public String toString()
	{
		return String.format("%d/%d", numerator, denominator);
	}
}