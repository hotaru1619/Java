package day07;

public class Test05 {
	public static void main(String[] args) {
		//Dog[] d;
		//Fish[] f;
		Animal[] animals = 
			{new Dog("진돗개", "캐리"),
				new Fish("쿠피"),
				new Fish("재피"),
				new Dog("말티즈", "몽이")
		}; //Dog도 Fish도 다른 데이터 타입 가능
	
	for (Animal data:animals) {
		if(data instanceof Dog)((Dog)data).print();
		if(data instanceof Fish)((Fish)data).print();
		data.breath();
	}
	}

}
