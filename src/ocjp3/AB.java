package ocjp3;

public class AB {
	public static void main(String[] args) {
		new B().process();//输出B
		A a = new B();
		System.out.println(a instanceof B);//返回true
		//a.process();//编译不通过
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
