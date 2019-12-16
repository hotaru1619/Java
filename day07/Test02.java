package day07;

public class Test02 {
	public static void main(String[] args) {
		// is a 관계 : 모든 객체의 데이터 타입은 부모가 될 수 있다.
		Object a = new Animal(); //down casting 준비
		((Animal)a).breath(); //Dog로 down casting 불가
		
		Animal a2 = new Animal(); 
		a2.breath();
		Object obj = a2;
		//부모		자식 ok
		//Animal temp = obj; error
		Animal temp = (Animal)obj; // down casting
		temp.breath();
		System.out.println("===============");
		
		//Object d1 = new Dog();
		//Animal d2 = new Dog();
		Dog d = new Dog();
		System.out.println(d.kind); // Dog class kind 강아지 종류
		Object obj2 = d;
		Animal a3 = (Animal)obj2; //Animal type으로 down casting
		Dog d3 = (Dog)obj2;		//
		System.out.println(a3.kind); //?????동물의종류=>강아지(super입력후)
		System.out.println(d3.kind);
		
		System.out.println("=========================");
		
		String msg = "hello java";
		Object obj7 = d; //Object a, d, msg 전부 넣을 수 있음.
		//But, a msg => error /Dog 객체여야 함.
		//instanceof 사용 이유
		if(obj7 instanceof Dog)
		System.out.println(((Dog)obj7).kind); //String에는 kind가 없음. 컴파일러가 못잡음.
		if(obj7 instanceof Animal)
			System.out.println(((Animal)obj7).kind);
		if(obj7 instanceof String)
		System.out.println(((String)obj7).toUpperCase());
	
	}

}
