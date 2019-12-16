package day05;

public class Calc {
//data 없고, 메소드 2개만 있음.
	public static int add(int a, int b){ 
		//void 대신 int/ int a, int b 매개변수 리스트, parameter
		// static new 불요 => 클래스 네임으로 접근
		return a+b;
	}
	
	public static int add(int ... a){ //가변인자 처리, 내부적으로 배열로 처리됨.
		// 중요~!! 가변인자의 위치는 맨 뒤~!!!!
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double add(double a, double b){ 
		//method overloading, add로 이름이 똑같아도 매개변수 타입이나 수가 다르면 성립 가능
		//메소드 오버로딩, 하나의 클래스 안에 동일한 이름의 메소드 존재 가능함.
		// ex. println
		
		return a+b;
	}
	
}
