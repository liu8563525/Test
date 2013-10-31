package test1;

public class Counter {

	// �½�һ����̬��ThreadLocal��������ͨ��get���������Ϊһ���ɷ��ʵĶ���
	    private static ThreadLocal<Integer> counterContext = new ThreadLocal<Integer>() {
		 protected synchronized Integer initialValue() {
		         return 10;
		 }
	};

	// ͨ����̬��get��������ThreadLocal�д洢��ֵ
	public static Integer get() {
		return counterContext.get();
	}

	// ͨ����̬��set����������ֵ���õ�ThreadLocal��
	public static void set(Integer value) {
		counterContext.set(value);
	}

	// ��װҵ���߼��������洢��ThreadLocal�еı���
	public static Integer getNextCounter() {
	    counterContext.set(counterContext.get() + 1);
	    return counterContext.get();
	}

	}
