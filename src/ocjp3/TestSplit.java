package ocjp3;

public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="a1b2c3s4";
		String[] tokens=test.split("\\s");
		for(String s:tokens)System.out.print(s+" ");
	}

}
