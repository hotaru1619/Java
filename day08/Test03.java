package day08;

public class Test03 {
	public static void main(String[] args) {
		
	}

}

class Point{
	int x;
	int y;
	
}

class Circle2 {
	//int x; //상속, is a관계 원은 점이다 => 원은 점을 가지고 있다 has a관계 선호
	//int y; //단일 상속만 가능하므로 extends Point의 경우 다른 상속관계 불가
	Point p; //has a관계
	int r;
	
}
