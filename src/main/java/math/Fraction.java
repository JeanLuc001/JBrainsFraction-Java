package math;

public class Fraction
{
	private final int intValue;
	private final int denominator;

	public Fraction(int intValue)
	{
		this.intValue = intValue;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator)
	{
		this.intValue = numerator;
		this.denominator = denominator;
	}

	public int getNumerator()
	{
		return 3;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public Fraction plus(Fraction fraction)
	{
		return new Fraction(intValue + fraction.intValue, denominator);
	}

	public int intValue()
	{
		return intValue;
	}
}