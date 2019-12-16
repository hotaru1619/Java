package day10_Collection;

public class Test02 {
	public static void main(String[] args) {

//		Employee2<String, String> emp1 
//		= new Employee2<String, String>("홍길동", "2019001");
//		System.out.println(emp1); //P제한으로 인해 에러
		
		Employee2<String, Integer> emp2 
		= new Employee2<String, Integer>("홍길동", 2019001);
		System.out.println(emp2.number/1000);
		
		Employee2<String, Double> emp3 
		= new Employee2<String, Double>("홍길동", 2019001.);
		System.out.println(emp3.number/1000);
		
	Employee2 emp4 = new Employee2("고길동", 201701);
		System.out.println(emp4);
		System.out.println(emp4.number.getClass()); 
		//타입 언급 없을 경우 => T : Object P : Number
		
	}

}


class Employee2<T, P extends Number>{ //P 타입 제한
	T name;
	P number;
	
	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}


}