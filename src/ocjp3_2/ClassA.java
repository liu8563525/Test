package ocjp3_2;

class ClassA {}
class ClassB extends ClassA {}
class ClassC extends ClassA {}
public class Test{
 public static void main(String[] args) {
  ClassA p0 = new ClassA();
  ClassB p1 = new ClassB();
  ClassC p2 = new ClassC();
  ClassA p3 = new ClassB();
  ClassA p4 = new ClassC();
  p0 = p1;
  //p1 =p2;
  p2 = p4;
  //p2 = (ClassC)p1;
 }
}

