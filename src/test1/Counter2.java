package test1;

public class Counter2 {

	public static int count = 10;

	// 封装业务逻辑，操作存储于ThreadLocal中的变量
	public static Integer getNextCounter() {
		count = count + 1;
		return count;
	}

}
