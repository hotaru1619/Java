package youngshinTest;

class Test01 {
	public static void main(String afgs[]) {
		A1 a1 = new A1();
		a1.methodA1(new B1());
	}
}

interface I1{
	public abstract void methodB1();
}

class A1{
	public void methodA1(I1 i) {
		i.methodB1();
	}
}	
class B1 implements I1{
	public void methodB1() {
		System.out.println("methodB1 in B1 class");
	}
}	
