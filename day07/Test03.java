package day07;

public class Test03 {
	public static void main(String[] args) {
		//생성자 함수
		
		Dog d1 = new Dog(); //[동물의 종류, 강아지 종류, null]
		d1.print();
		
		Dog d2 = new Dog("진돗개", "캐리"); //[동물의 종류, 진돗개, 캐리]
		d2.print();
		
		Dog d3 = new Dog("시베리안허스키", "해피");
		//super.kind ="강아지";입력  => [강아지, 시베리안허스키, 해피]
		d3.print();
	
		
	}

}
