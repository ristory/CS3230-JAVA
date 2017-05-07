public class Fraction
{
	private int numerator;
	private int denominator;
	public Fraction(int numerator)
	{
		numerator = this.numerator/this.denominator;
		this.denominator = 1;
	}
	
	private int gcd(int u, int v)
		{
		u = (u < 0) ? -u : u; 
		v = (v < 0) ? -v : v;
		while (u > 0)
		{
		if (u < v)
		{
		int t = u;
		u = v;
		v = t;
		}
		u -= v;
		}
		return v;
		
                }
       public Fraction(int numerator, int denominator)
	{
                this.numerator = numerator;
		this.denominator = denominator;
		int divisor = gcd(numerator, denominator);
                this.numerator /= divisor;
                this.denominator /= divisor;		
	}
		
	public Fraction add(Fraction right)
		{
                   
                    Fraction F3 = new Fraction((numerator*right.denominator)+(right.numerator*denominator), denominator * right.denominator);
                    return F3;
                    
		}
       
	public Fraction sub(Fraction right)
		{
                    
                     Fraction F3 = new Fraction((numerator*right.denominator)-(right.numerator*denominator), denominator * right.denominator);
                     return F3;
		}
	public Fraction mult(Fraction right)
		{
                    
                     Fraction F3 = new Fraction(numerator * right.numerator,denominator * right.denominator);
                     return F3;
		}
        public Fraction div(Fraction right)
		{
                   
                     Fraction F3 = new Fraction(numerator * right.denominator,denominator * right.numerator);
                     return F3;
		}
  
	@Override public boolean equals(Object other)
	{
		if (this == other)		
			return true;
		if (other == null)
			return false;
                if (getClass() != other.getClass())
                    return false;
                Fraction otherObject = (Fraction)other;
                return numerator == otherObject.numerator && denominator == otherObject.denominator;
	}	
	 public String toString()
	{
		return numerator + "/" + denominator;
	}	
		
	
}