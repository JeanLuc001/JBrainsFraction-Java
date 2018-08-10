package math;

public class Fraction
{
	private final int intValue;

	public Fraction(int intValue)
	{
		this.intValue = intValue;
	}

	/**
	 * Tutor wuerde es in realen Projekten nicht so implementieren! Dieser
	 * "micro step" ist nur sinnvoll, wenn der naechste Schritt noch unklar ist!
	 */
	public Fraction plus(Fraction fraction)
	{
		return new Fraction(intValue + fraction.intValue);
	}

	public int intValue()
	{
		return intValue;
	}
}