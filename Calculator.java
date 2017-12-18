/**
	����� ��������� �����������.
*/
public class Calculator {
	/**
		��������� ����������.
	*/
	private double result;
	/**
	��������� ���������.
	@param params ��������� ������������.
*/
	public void summ(double a, double b) {
		this.result = a + b;
		
	}
	/**
	�������� ���������.
	@return ��������� ����������.
	*/
	public double getResult() {
		return this.result;
	}
	/**
		�������� ��������� ����������.
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