package school;

import day07.Animal;

public class Test_School {
	public static void main(String[] args) {
		
		Person[] persons = 
				{new Student("홍길동", 20, 200201),
				new Teacher ("이순신", 30, "JAVA" ),
				new Employee("유관순", 40, "교무과"),
		}; 	
		for (Person data:persons) {
			data.print();
		}
		
	}

}
