package threadlocalA;

public class TreadeLoaclATest {
	public static void main(String[] args){
		A a=new A();
		System.out.println(a.ww);
		ThreadLocal<A> threadLocal=new ThreadLocal<A>();
		ThreadLocal<A> threadLocal2=new ThreadLocal<A>();
		threadLocal.set(a);
		threadLocal2.set(a);
		System.out.println(threadLocal.get());
		System.out.println(threadLocal2.get());
	}
}
