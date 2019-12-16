package day10_Collection;

public class Test01 {
	public static void main(String[] args) {
		Employee<String> emp1
		= new Employee<String>("홍길동", "2019001");
		//지네릭(Generic) 타입 호출
		System.out.println(emp1);
		System.out.println(emp1.number.charAt(3));
		
		Employee<Integer> emp2 
		= new Employee<Integer> ("고길동", 2019001);
		System.out.println(emp2);
		System.out.println(emp2.number.getClass());

		Employee emp3 = new Employee("김길동", 2019003); //
		System.out.println(emp3);
		System.out.println(emp3.number.getClass()); 
		//타입에 대해 언급하지 않으면 Object, emp3은 Object
	}

}

class Employee<T>{
	//<T> 타입변수, 임의의 참조형 타입
	String name;
	T number; //type 결정 못함. <T>
	
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
}
