package ocjp3;

public class AB {
	public static void main(String[] args) {
		new B().process();//���B
		A a = new B();
		System.out.println(a instanceof B);//����true
		//a.process();//���벻ͨ��
	}
}
class A{
	void process() throws Exception {throw new Exception();}
	//void process() {System.out.println("A");}
}
class B extends A{
	void process() {
		//super.process();
		//throw new Exception();
		System.out.println("B");
	}
	//void process() {System.out.println("B");}
}
