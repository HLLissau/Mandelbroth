
public class Complex {
	private double re;
	private double im;
	
	//constructor. Creates a new Complex, without values
	public Complex() {
		
	}
	//constructor. creates a new complex from values
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;	
	}
	
	//constructor. creates a copy of z
	public Complex(Complex z) {
		this.re = z.GetRe();
		this.im = z.getIm();
	}
	
	public double GetRe() {
		return this.re;
	}
	
	public double getIm() {
		return this.im;
	}
	
	public double abs() {
	return Math.sqrt(((im*im)+(re*re)));	
	} 
	
	//add this with other complex number
	public Complex plus(Complex other) {
		Complex x = new Complex(((other.GetRe()+this.re)),this.im+other.getIm());
	return x;
	}
	
	//Multiply this with other complex number
	public Complex times(Complex other) {
		Complex x = new Complex(((other.GetRe()*this.re)-(other.getIm()*this.im)),this.im*other.GetRe()+this.re*other.getIm());
	return x;
	}
	
	public String toString() {
		return (this.re + " + " + this.im + "i");
	}
}
