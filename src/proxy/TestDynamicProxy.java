package proxy;

public class TestDynamicProxy {
	public static void main(String[] args) {
		LogTalk dynamicproxy = new LogTalk();
		ITalk proxy = (ITalk) dynamicproxy.bind(new TalkToSomebody());
		proxy.talk("YangYi");
		//DynamicAopProxy d;
				
	}
}
