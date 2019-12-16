package day09;

public class Test02_Spring {
	public static void main(String[] args) {
		D d = new D(new C("고길동"));
		d.print();
	}

}


//class A{
//	String name = "홍길동";
//
//
//class B{
//	void print() {
//		System.out.println(name);
//	}
//}
//}//B이너클래스 아웃터클래스인 A자원 마음껏 사용 가능



class C{
	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public C(String name) {
		super();
		this.name = name;
	}
	

}
class D{
	C c ;
	
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	
//	public B() {
//		super();
//	}

	public D(C c) {
		super();
		this.c = c;
	}

	void print() {
		System.out.println(c.name);
	}
}
