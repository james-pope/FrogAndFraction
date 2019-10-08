public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	//
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
	public Fraction(){
		numerator = 1;
		denominator = 1;
	}
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)			//addition method
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.denominator;
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	public Fraction subtract(Fraction other){		//subtraction method
		int n = this.numerator*other.denominator - this.denominator*other.numerator;
		int d = this.denominator*other.getDenom();
		
		Fraction result = new Fraction(n, d);
		return result;
	}
	public Fraction multiply(Fraction other){		//multiplication method
		int n = this.numerator*other.numerator;
		int d = this.denominator*other.denominator;
		
		Fraction result = new Fraction(n, d);
		return result;
	}
	public String toString(){		//creates a string so we can see the fraction
		int n = numerator;
		int d = denominator;
		return n + "/" + d;
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);		// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);		// print the answer
			

		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Fraction f5 = f1.multiply(f2);		//multiplies f1 and f2
		System.out.println(f1 + " * " + f2 + " = " + f5);
		
		//create 2 new fractions and add them here.
		Fraction f6 = new Fraction(6,5);
		Fraction f7 = new Fraction(9,4);
		Fraction f8 = f6.add(f7);
		System.out.println(f6 + " + " + f7 + " = " + f8);
	}
/*
OUTPUT:
3/4 + 4/5 = 31/20
3/4 - 4/5 = -1/20
3/4 * 4/5 = 12/20
6/5 + 9/4 = 69/20
 */
}