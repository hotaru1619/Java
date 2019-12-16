package day08;

public abstract class Animal { //abstract 객체생성 불가, Animal a = new Animal(); 불가
	protected String kind = "동물의 종류";
	
		public Animal() {
			super();
		}

		public Animal(String kind) {
			super();
			this.kind = kind;
		}

	 abstract void breath(); //구현부 없는 메소드, 미완성 코드, 추상 메서드
}
