package ocjp3;

class Certkiller1 {
	public Certkiller1() {
		System.out.print(1);
	}
	public Certkiller1(int i) {
		System.out.print(11);
	}
}
class Certkiller2 extends Certkiller1 {
	public Certkiller2() {
		System.out.print(2);
	}
	public Certkiller2(int i) {
		System.out.print(22);
	}
}
class Certkiller3 extends Certkiller2 {
	/*public Certkiller3() {
		System.out.print(3);
	}*/
	public Certkiller3(int i) {
		System.out.print(33);
	}
}
public class Numbers {
	public static void main(String[] args) {
		new Certkiller3(3);
	}
}
