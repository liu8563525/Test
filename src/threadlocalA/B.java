package threadlocalA;

public class B extends A{

	public B(){
		this.ww=5;
	}
	public B(int ww){
		super(ww);
		this.ww=ww;
	}
	public void foo(){
		int i=1;
		super.foo();
	}
}
