package ocjp1;

public class Test {
	public enum Dogs{co,ha};
	public static void main(String[] args){
		Dogs dogs=Dogs.co;
		switch (dogs) {
		case co:
			System.out.println("co");
			//break;
		case ha:
			System.out.println("ha");
		default:
			break;
		}
	}
}
