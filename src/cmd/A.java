package cmd;

public class A {
	public int sum = 0;
	public int div = 0;

	public static A Sum(int a, int b) {
		A a1 = new A();
		a1.sum = a + b;
		return a1;
	}

	public static A Div(int a, int b) {
		A a1 = new A();
		a1.div = a / b;
		return a1;
	}
}
