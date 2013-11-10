package ocjp4;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		//date.setLocal(Locale.ITALY);
		Locale locale=Locale.getDefault();
		DateFormat dFormat =DateFormat.getDateInstance(0, locale);
		//dFormat.setLocal(Locale.ITALY);
		String string=dFormat.format(date);
		System.out.println(locale.getDisplayCountry()+""+string);
		System.out.printf("%b", -5);
		System.out.printf("%d", Math.PI);
		LinkedList<?> list=new LinkedList<?>();//错误的定义
		list.toArray();//返回Object[]
		addString(list);
		List list2=new ArrayList();//定义集合变量需加上泛型，否则出现警告
		//Collections.reverseOrder(Comparator<T> cmp)
		int[] myArray=new int[5];
		Arrays.asList(myArray);//asList(T... a)
		Collections.sort(list2);
		Collections.binarySearch(list2, "a");//二分法排序前必须先sort方法升序排序
	}
	
	private static void addString(List<? super String> list){
		list.add("abc");
	}

}
