//Test of Complex class
public class ComplexTest {
	public static void main(String[] args) {
		
		Complex z1 = new Complex(1,2);
		Complex z2 = new Complex(3,4);
		System.out.println(z1.plus(z2));
		System.out.println(z1.times(z2));
		System.out.println("z1 = " + z1.toString());

		System.out.println("z2 = " + z2.toString());
	}
}
