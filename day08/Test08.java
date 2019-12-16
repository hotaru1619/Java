package day08;

public class Test08 {
	public static void main(String[] args) {
	Drawable[] s=	{new Circle(), new Rectangle()};
	for (Drawable data : s) {
		data.draw();
		((Moveable)data).move();
	} //인터페이스 통합(타입 통합시킬 때 많이 사용됨.)의 필요성
	
		System.out.println("=======================");
		T[] t = {new Circle(), new Rectangle()};
		for(T data:t) {
			data.draw();
			data.move();
		}//인터페이스 통합 작용 
	}

}

interface Drawable{
	void draw();
}

interface Moveable{
	void move();
}

interface T extends Drawable, Moveable{} //* 인터페이스 통합

class Circle implements T{//Drawable, Moveable{
	String name = "Circle";

	@Override
	public void move() {
		System.out.println(name+"   이동(move)");
	}

	@Override
	public void draw() {
		System.out.println(name+"   그리기(draw)");
	}
	
	
}

class Rectangle implements T{//Drawable, Moveable{
	
	String name = "Rectangle";

	@Override
	public void move() {
		System.out.println(name+"   이동(move)");		
	}

	@Override
	public void draw() {
		System.out.println(name+"   그리기(draw)");
	}
	
}
