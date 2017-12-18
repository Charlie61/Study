public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		System.out.println("Sum " +summ);
		double minus = first - second;
		System.out.println("Minus " +minus); 
		double multi = first * second;
		System.out.println("Multiply " +multi);
		double div = first / second;
		System.out.println("Division " +div);
		double ext = Math.pow(first, second);
		System.out.println("Extend " +ext);
	}
}