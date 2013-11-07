package ocjp3_2;


public class AA {
	void process() {System.out.println("A");}
	public static void main(String[] args) {
		try{((AA)new B()).process();//Êä³öB
		}catch(Exception exception){
			System.out.println("Exception");
		}
	}
	class B extends AA{
		void process() throws Exception{
			super.process();
			throw new Exception();
			System.out.println("B");
		}
	}
}

