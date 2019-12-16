package inheritance_submit;

public class Inheritance {
	public static void main(String[] args) {
		
		Student [] s;
		Teacher [] t;
		Employee [] e;
		
		Person[] persons = {
					new Teacher("김선생", 35, "java"),
					new Teacher("이선생", 37, "sql"),
					new Student("김학생", 21, 201901),
					new Student("고학생", 23, 201701),
					new Employee("박사원", 30, "교학부")
		};
		
		for(Person data : persons) {
//			if(data instanceof Employee) ((Employee)data).print();
//			if(data instanceof Teacher) ((Teacher)data).print();
//			if(data instanceof Student) ((Student)data).print();
//		} //오버라이딩 전
		
		data.print(); //다형성의 한 예
		}
	}
	}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super(); //생략해도 무조건 호출
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.printf("이      름 : %s 나      이 : %d " , this.getAge(), getAge());
		}
}//오버라이딩 적용 위해 마지막으로 코드 작성함.

class Student extends Person{
	int id;
	
	public Student(String name, int age) {
		super(name, age);
	}


	public Student(String name, int age, int id) {
		super(name, age);
		//this.setName(name);
		//this.setAge(age);
		this.id = id;
	}

	public void print() {
		super.print();
		//System.out.printf("이      름 : %s 나      이 : %d " , this.getAge(), super.getAge());
		System.out.printf("학      번  : %d %n", id);
	}
	
}

class Teacher extends Person{
	String subject;
	
	public Teacher(String name, int age) {
		super(name, age);
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}


	public void print() {
		super.print();
		//System.out.printf("이      름 : %s 나     이 : %d " , this.getAge(), super.getAge());
		System.out.printf("담당과목  : %s %n", subject);
	}
}

class Employee extends Person{
	String dept;
	
	public Employee(String name, int age) {
		super(name, age);
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		//System.out.printf("이      름 : %s 나      이 : %d " , this.getAge(), super.getAge());
		System.out.printf("부      서  : %s", dept);
	}
	
}

