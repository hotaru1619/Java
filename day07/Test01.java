package day07;

public class Test01 {
	public static void main(String[] args) {
		Dog d = new Dog(); //객체 생성
		d.print();
		System.out.println(d.kind);
		//d.super.kind 불가. main method에선 불가.
//		public String getSuperKind() {
//			return super.kind;
//		}
//		Dog class에  코드 추가
		
		// main method this super 키워드 사용할 수 없다.
		System.out.println(d.getSuperKind());
		
		//is a관계
		//모든 객체의 데이터 타입은 부모가 될 수 있다.
	}

}
