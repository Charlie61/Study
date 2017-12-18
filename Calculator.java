/**
	Класс реализует калькулятор.
*/
public class Calculator {
	/**
		результат вычисления.
	*/
	private double result;
	/**
	суммируем аргументы.
	@param params Аргументы суммирования.
*/
	public void summ(double a, double b) {
		this.result = a + b;
		
	}
	/**
	получить результат.
	@return результат вычисления.
	*/
	public double getResult() {
		return this.result;
	}
	/**
		очистить результат вычисления.
	*/
	public void cleanResult() {
		this.result = 0;
	}
	
	public void minus(double a, double b) {
		this.result = a - b;
	}
	public void div(double a, double b) {
		this.result = a/b;
	}
	public void mul(double a, double b) {
		this.result = a*b;
	}
	public void ext(double a, double b) {
		this.result = Math.pow(a, b);
	}
}