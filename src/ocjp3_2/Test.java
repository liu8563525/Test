package ocjp3_2;

class A {}
class ClassB extends A {}
class ClassC extends A {}
public class Test{
 public static void main(String[] args) {
  Test p0 = new Test();
  ClassB p1 = new ClassB();
  ClassC p2 = new ClassC();
  Test p3 = new B();
  Test p4 = new C();
  p0 = p1;
  //p1 =p2;
  p2 = p4;
  //p2 = (ClassC)p1;
 }
}

