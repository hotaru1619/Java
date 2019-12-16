package day08;

public class Dog extends Animal{

	String kind = "강아지 종류";
	String name;
	
	public String getSuperKind() {
		return super.kind;
	}
	
	public Dog() {
		super("강아지");//super();=>super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
		//super.kind ="강아지"; //Test03
		this.kind = kind;
		this.name = name; //생성자 함수 리턴값 언급 불요.
	}

	public void print() {
		System.out.printf("[%s, %s, %s]%n" ,super.kind, this.kind, this.name);
	} //super.kind_Animal

//The type Dog must implement the inherited abstract method Animal.breath()
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기...");
	} //부모의 접근지정자가 디폴트이므로 디폴트, protected, public 가능
	  //부모가 public이면 자식도 public이어야 함.
}
