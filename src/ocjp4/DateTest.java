package ocjp4;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
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
		LinkedList<?> arrayList=new LinkedList<?>();//错误的定义
	}

}
