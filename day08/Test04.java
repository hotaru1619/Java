package day08;

public class Test04 {
	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1+" "+msg2);
		System.out.println(msg1.equals(msg2));
		//String에는 equals() override 되어 있음.
		
		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("홍길동", 22);
		Person p3 = null;
		
		System.out.println(p1+" "+p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(null)); //false => overriding ok
		System.out.println(p1.equals(p3)); 
		System.out.println(p1.equals(msg1)); 
		//오버라이딩 필요
		
		System.out.println("================================");
		System.out.println(msg1.toString());
		System.out.println(msg2);
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
//		//Object obj;//모든 데이터 타입 다 넣을 수 있음. 초기화 안됨.
//		//Object obj = msg1;
		Object obj = p1;
		System.out.println(obj);
		System.out.println(((Person)obj).name); //down casting
		
		obj = msg1;
		System.out.println(obj);
		System.out.println(obj.toString());//casting 없이 하단부 toString 호출
		System.out.println(((String)obj).toUpperCase()); //check
		//System.out.println(msg1.toUpperCase()); //check
		
	}
}

class Person{
	String name;
	int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	 public String toString() {
		 return "Person["+name+" :"+age+"]";
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
	     boolean f = false;
	     if(obj instanceof Person) {
	    	 Person p = (Person) obj; //down casting
	    	 if(name.equals(p.name)&& age == p.age) {
	    		 f = true;
	    	 }
	     }
	     return f;
		 //return (this.name == p.name) && (this.age == p.age);
	    }
	 
	 
//	 public String toUpperCase() {
//	        return toUpperCase();
//	    }
}

