package day08;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("말티즈", "몽이"),
				new Fish("쿠쿠")
		};
		
		for(Animal data:animals) {
			data.breath();
		} //다형성(polymorphism)

	}
 
}
