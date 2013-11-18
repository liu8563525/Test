package maptest;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Object> hashMap=new HashMap<String, Object>();
		A a=new A();
		B b=new B();
		hashMap.put("key1", a);
		hashMap.put("key2", b);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.entrySet());
		Set<Entry<String, Object>> set=hashMap.entrySet();
		System.out.println(set);
		for (Entry<String, Object> entry : set) {
			System.out.println(entry);
		}
		System.out.println(a.hashCode());
		System.out.println(a.getVersion());
		long version=a.getVersion().longValue()+1;
		System.out.println(version);
	}

}
class A{
	private String name="a";
	private Number version=null;
	public A(){
	}
	public A(String nameString){
		this.name=nameString;
	}
	public String getName(){
		return this.name;
	}
	public Number getVersion(){
		return this.version;
	}
}
class B{
	private String name="b";
	public B(){
	}
	public B(String nameString){
		this.name=nameString;
	}
	public String getName(){
		return this.name;
	}
}
