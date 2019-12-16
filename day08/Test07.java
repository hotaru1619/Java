package day08;

public class Test07 {
	public static void main(String[] args) {
		Circle_a a = new Circle_a(); //a의 부모 abstract class
		System.out.println(a.cArea(5));
		a.print();
		a.color="~~~";
		
		Circle_i i = new Circle_i();
		System.out.println(i.cArea(5));
		//i.color ="~~~~~~"; //상수, 에러
	}
}

class Circle_a extends Shape_a{
	//원의 면적
	@Override
	public double cArea(double r) {
		return Math.PI*r*r;
	}
}

abstract class Shape_a{
	String color;
	public abstract double cArea(double r) ;  //기반코드(틀 제공) , 추상 메서드
	public void print() { //인스턴스 자원
	}	
}

interface Shape_i{
	
	final static String color = "red";
	double cArea(double r) ; //public abstract 생략 무방
}

class Circle_i extends Object implements Shape_i{
	@Override
	public double cArea(double r) {
		return Math.PI*r*r;
	}
} //Circle_i의 부모는 Object, Shape_i
