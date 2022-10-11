package pjh;

class A{
	A(int i, int j){
		this();
		System.out.println(i+j);
		System.out.println();
		System.out.println("j = " + j );
		System.out.println("i = " + i );
	}
	A(){
		System.out.print("i + j 는 ? = ");
	}
}
class B{
	void print(String s) {
		 System.out.println(s);
	}
}
public class testClass {
	public static void main(String []ar){
		
		B b = new B();
		b.print("더하기 계산기");
		
		A a = new A(3,4);
		
	}
}
