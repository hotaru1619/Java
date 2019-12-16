package day07;

public class Animal {

	String kind = "동물의 종류";

		//부모의 기본 생성자를 가져옴
		public Animal() {
			super();
		}

		public Animal(String kind) {
			super();
			this.kind = kind;
		}

		public void breath() {
			System.out.println("폐로 숨쉬기...");
		}
}
