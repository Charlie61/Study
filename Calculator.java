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
	public void summ(double ... params) {
		for (Double param : params) {
			this.result +=param;
		}
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
	
	public void minus(double ... params) {
		for (Double param : params) {
		this.result -= param;
		}
	}
}