package ocjp3;

public class FooBar {
	public static void main(String[] args) {
		Foo f =new Bar();
		f.addFive();
		//System.out.println(f);
		System.out.println(f.a);
	}
}
class Foo {
    public int a = 3;
    public void addFive() { a += 5;System.out.print("f "); }
}
class Bar extends Foo {
    public int a = 8;
    public void addFive() { this.a += 5;System.out.print("b " ); }
}