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
				System.out.println("Select action");
				String action = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				if (action.equals("+")) {	
				calc.summ(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				}
				if (action.equals("-")) {
				calc.minus(Double.valueOf(first), Double.valueOf(second));
				System.out.println("Result: " + calc.getResult());
				}
				calc.cleanResult();
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
