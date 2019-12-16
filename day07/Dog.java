package day07;

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
}
