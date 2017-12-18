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
	public void summ(double ... params) {
		for (Double param : params) {
			this.result +=param;
		}
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
	
	public void minus(double ... params) {
		for (Double param : params) {
		this.result -= param;
		}
	}
}