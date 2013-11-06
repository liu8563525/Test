package ocjp3_2;

public class TestConsSeq {

	public static void main(String[] args) {
		/*
		 * ����ԭ��
		 * һ����̬��Ա������Static��
		 * 	1����̬��Ա����Ϊ����������ж�����ͬһ�ڴ�ռ�
		 * 	2����̬��Ա�����������Ͷ�������״μ�����ʱִ��һ��
		 * 	3���״μ�����ʱ���ȶ����о�̬��Ա������������Ĭ�ϸ���ֵ��Ȼ���ٶ�����ֵ�ĸ���ֵ
		 * ������̬��ʼ��
		 * 	1����̬��ʼ��������״μ�����ʱִ��һ��
		 * �����������������̬��Ա�����뾲̬ʼ������ճ���˳���Ⱥ�ִ�С�����������
		 * ������̬��Ա����
		 * 	1����̬��Ա����������ÿ��ʵ��������ʱ�ڹ��캯��֮ǰִ��
		 * �ġ���̬��ʼ����
		 * 	1����̬��ʼ������ÿ��ʵ��������ʱ�ڹ��캯��֮ǰִ��
		 * �����������������̬��Ա�����붯̬��ʼ������ճ���˳���Ⱥ�ִ�С�����������
		 * �ܽ᣺�ܵ���˵���ڲ��漰�̳е�ǰ���£����״μ�����ʱ����������˳��ִ��
		 * 	1�����ճ���˳���Ⱥ�ִ�о�̬��Ա���������뾲̬��ʼ����
		 * 	2�����ճ���˳���Ⱥ�ִ�ж�̬��Ա���������붯̬��ʼ����
		 * 	3��ִ�й��캯��
		 * 	�ٴ�ʵ��������ʱִֻ�е�2��3������
		 *
		 * ��������������������������Ա�����붨�����ʼ�������ڹ��캯��ִ�С�����������������
		 * �塢���漰���̳�ʱ����������˳��ִ��
		 * 	1��ִ�и���ľ�̬��Ա���������뾲̬��ʼ���飬ִ������ľ�̬��Ա���������뾲̬��ʼ����
		 * 	2��ִ�и���ķǾ�̬��Ա���������붯̬��ʼ���飬ִ�и��๹�췽��
		 * 	3��ִ������ķǾ�̬��Ա���������붯̬��ʼ���飬ִ�����๹�췽��
		 * �����๹�췽�����õ��ķ�������ѱ�������д����ô�ڹ����������ʱ�ڵ��ø��๹�캯����ʹ��������д�ķ���
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
        /* ��i=2ʱ�Ľ���
         * Ϊʲô��2��3�أ�
         * ��ʵ�����ִ��˳���������ģ��ڳ�ʼ��c1��ʱ�����ȼ�����
         * ���徲̬����t1,i1,i2������ֵnull,0,0
         * Ȼ�������ֵ���ʽnew C(),׼�����˶��󸳸���̬��Ա����c
         * 		Ȼ���ϲ��о�̬��Ա�����Ѷ��壬ֱ��ִ��c�Ĺ��캯������
         * 		����i1++,i2++��ִ�У�i1,i2����Ϊ1
         * ����ִ�е�int i1;û�и�ֵ��䣬 i1,i2��ֵ��Ȼ��1
         * ����ִ�е�int i2 = 2ʱi2����ֵ2����i1 = 1,i2 = 2
         * ����ִ�е�c1�Ĺ��캯����i1,i2��ִ��++����ʱi1 = 2��i2 = 3
         * ���i1��i2��������ǣ�c1.i1 = 2��c1.i2 = 3
         * ͨ������Ĵ������ǿ�����ΪϵͳĬ��ֵ�ĸ����ͨ���Ⱥŵĸ�����ִ�С�
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