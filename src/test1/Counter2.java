package test1;

public class Counter2 {

	public static int count = 10;

	// ��װҵ���߼��������洢��ThreadLocal�еı���
	public static Integer getNextCounter() {
		count = count + 1;
		return count;
	}

}
