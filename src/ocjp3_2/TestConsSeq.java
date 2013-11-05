package ocjp3_2;

public class TestConsSeq {

	public static void main(String[] args) {
		/*
		 * 几大原则
		 * 一、静态成员变量（Static）
		 * 	1、静态成员变量为类变量，所有对象共享同一内存空间
		 * 	2、静态成员变量的声明和定义仅在首次加载类时执行一次
		 * 	3、首次加载类时首先对所有静态成员变量根据类型默认赋初值，然后再对有右值的附右值
		 * 二、静态初始块
		 * 	1、静态初始化块仅在首次加载类时执行一次
		 * ······多个静态成员变量与静态始化快参照出现顺序先后执行······
		 * 三、动态成员变量
		 * 	1、动态成员变量定义在每次实例化对象时在构造函数之前执行
		 * 四、动态初始化块
		 * 	1、动态初始化块在每次实例化对象时在构造函数之前执行
		 * ······多个动态成员变量与动态初始化块参照出现顺序先后执行······
		 * 总结：总的来说，在不涉及继承的前提下，当首次加载类时，按照如下顺序执行
		 * 	1、按照出现顺序先后执行静态成员变量定义与静态初始化块
		 * 	2、按照出现顺序先后执行动态成员变量定义与动态初始化块
		 * 	3、执行构造函数
		 * 	再次实例化对象时只执行第2、3步即可
		 *
		 * ············成员变量与定义与初始化块先于构造函数执行·········
		 * 五、当涉及到继承时，按照如下顺序执行
		 * 	1、执行父类的静态成员变量定义与静态初始化块，执行子类的静态成员变量定义与静态初始化块
		 * 	2、执行父类的非静态成员变量定义与动态初始化块，执行父类构造方法
		 * 	3、执行子类的非静态成员变量定义与动态初始化块，执行子类构造方法
		 * 另：父类构造方法中用到的方法如果已被子类重写，那么在构造子类对象时在调用父类构造函数中使用子类重写的方法
		 */
		int i = 0;
		switch(i) {
		case 0:

			new A();
			new A();

			break;
		case 1:

			A ab = new B();

			break;
		case 2 :

			C c1 = new C();
			System.out.println("c.i1 = " + c1.i1);//2
			System.out.println("c.i2 = " + c1.i2);//3

			break;
		}
        /* 对i=2时的解释
         * 为什么是2和3呢？
         * 其实代码的执行顺序是这样的：在初始化c1的时候首先加载类
         * 定义静态变量t1,i1,i2并赋初值null,0,0
         * 然后计算右值表达式new C(),准备将此对象赋给静态成员变量c
         * 		然而上步中静态成员变量已定义，直接执行c的构造函数即可
         * 		这样i1++,i2++被执行，i1,i2都变为1
         * 继续执行到int i1;没有赋值语句， i1,i2的值仍然是1
         * 继续执行到int i2 = 2时i2被赋值2，即i1 = 1,i2 = 2
         * 继续执行到c1的构造函数，i1,i2再执行++，此时i1 = 2，i2 = 3
         * 输出i1，i2，结果就是：c1.i1 = 2，c1.i2 = 3
         * 通过上面的代码我们可以认为系统默认值的给予比通过等号的赋予先执行。
         */
	}
}

class A {
	public A() {
		System.out.println("construct A");
		m();
		System.out.println();
	}

	private int ai = getAI();

	{
		System.out.println("dynamic block in A");
	}

	static {
		System.out.println("static block in A");
	}

	private static int asi = getASI();

	static int getASI() {
		System.out.println("initial static int asi");
		System.out.println();
		return 5;
	}

	static int getAI() {
		System.out.println("initial int ai");
		return 10;
	}

	public void m() {
		System.out.println("A.m()");
	}
}

class B extends A{
	public B() {
		System.out.println("construct B");
		super.m();
		m();
	}

	{
		System.out.println("dynamic block in B");
	}
	private int bi = getBI();
	private static int bsi = getBSI();


	static {
		System.out.println("static block in B");
		System.out.println();
	}

	static int getBSI() {
		System.out.println("initial static int bsi");
		return 5;
	}

	static int getBI() {
		System.out.println("initial int bi");
		return 10;
	}

	public void m() {
		System.out.println("B.m() bi=" + bi);
	}
}

class C{
    private static C c = new C();
    public static int i1;
    public static int i2 = 2;

    public C(){
        i1++;
        i2++;
    }
}