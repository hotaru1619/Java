package school;

public class Student extends Person {
	
	private int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	} //수정 부분

	@Override
	public void print() {
		System.out.printf("이 름 : %s 나 이 : %d 학 번: %d %n", super.getName(), super.getAge(), this.id);
	}
	
	
	
}
