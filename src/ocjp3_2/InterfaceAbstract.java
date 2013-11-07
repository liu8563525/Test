package ocjp3_2;

public class InterfaceAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface DoStuff2{
	float getRange(int w,int h);
}
interface DoMore{
	float getAvg(int a,int b,int c);
}
abstract class DoAbstract implements DoStuff2,DoMore{}
class DoStuff implements DoStuff2{
	public float getRange(int x,int y){return 3.14f;}//去掉public就变成default修饰，这样是不可以的
}
interface DoAll extends DoMore{
	float getAvg(int a,int b,int c,int d);
}