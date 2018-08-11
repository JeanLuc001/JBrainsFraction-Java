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
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public Fraction plus(Fraction fraction)
	{
		return new Fraction(numerator + fraction.numerator, denominator);
	}

	public int intValue()
	{
		return numerator;
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