import java.util.Scanner;

/**
	класс для запуска калькулятора. поддерживает ввод пользователя.
*/
public class InteractRunner {
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				double a = Double.valueOf(first);
				System.out.println("Select action");
				String action = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				double b = Double.valueOf(second);
				if (action.equals("+")) {	
				calc.summ(a, b);
				}
				if (action.equals("-")) {
				calc.minus(a, b);
				}
				if (action.equals("*")) {
				calc.mul(a, b);
				}
				if (action.equals("/")) {
				calc.div(a, b);
				}
				if (action.equals("^")) {
				calc.ext(a, b);
				}
				System.out.println("Result: " + calc.getResult());
				System.out.println("Clear the result?: yes/no");
				String memory = reader.next();
				if (memory.equals("yes")){
				calc.cleanResult();
				}
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
