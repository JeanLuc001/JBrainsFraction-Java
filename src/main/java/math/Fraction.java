package math;

public class Fraction
{
	private final int intValue;
	private final int numerator;
	private final int denominator;

	public Fraction(int intValue)
	{
		this.intValue = intValue;
		this.numerator = intValue;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator)
	{
		this.intValue = numerator;
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
}