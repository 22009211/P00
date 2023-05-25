
public class Calculator {
//first time
	public int add(int a, int b) {
		 return a + b;
		}
	public int subtract(int a, int b) {
		 return a - b;
	}
	public int multiple(int a, int b) {
		 return a * b;
	}
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("ERROR");
		}
		return a / b;
	}
}