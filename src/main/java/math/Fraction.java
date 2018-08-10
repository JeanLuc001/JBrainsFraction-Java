package math;

public class Fraction
{
	private final int intValue;

	public Fraction(int intValue)
	{
		this.intValue = intValue;
	}

	public Fraction plus(Fraction fraction)
	{
		return this;
	}

	public int intValue()
	{
		return intValue;
	}
}