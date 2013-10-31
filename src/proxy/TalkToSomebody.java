package proxy;

public class TalkToSomebody implements ITalk {
	public void talk(String name) {
		System.out.println("Hi,ni hao," + name);
	}
}