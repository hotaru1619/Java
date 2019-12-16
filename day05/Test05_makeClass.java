package day05;

public class Test05_makeClass {
	public static void main(String[] args) {

		Employee emp1 = new Employee(); //1. Emoloyee클래스가 없어서 에러,클래스 만들기
		emp1.name = "홍길동";
		emp1.dept = "기술부";
		emp1.age = 32;
		
		Employee emp2 = new Employee(); //3.객체 생성 /emp1 reference type
		emp2.name = "고길동";
		emp2.dept = "교육부";
		emp2.age = 29; //5. 초기값(null null 0) 변경
		
		Employee emp3 = emp1; //call by reference
		
		emp1.print(); //4.print method 호출
		emp2.print(); 
		emp3.print(); 
		
		Employee[] employees = new Employee[3];
		// 클래스의 배열, employees는 Employee 주소 모아서 관리
	}

}

class Employee{ //2. class 만들기
	String name; //data, 메소드(기능) 밖의 변수, 클래스 구성요소, 멤버 variable
	String dept; //data
	int age; //data

	public void print() {
		System.out.printf("[%s, %s, %d]%n", this.name, this.dept, this.age);
		return;
	} //print method
}