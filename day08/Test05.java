package day08;

public class Test05 {
	public static void main(String[] args) {
		
		Account a1 = new Account("kim", "001", 300);		
		Account a2 = new Account("lee", "002", 300);
		Account a3 = new Account("kim", "001", 300);
		
		System.out.println(a1);
		System.out.println(a2); //주소 찍음. toString(*정보 찍음) overriding 하지 않아서.
		//오버라이딩 후(이클립스>소스) 데이타 제대로 나옴.
		
		System.out.println(a1.equals(a2)); //false				=> false
		System.out.println(a1.equals(a3)); //false, 주소가 달라서	=> true
		//오버라이딩(이클립스>소스>헤시코드 이콜 생성) 
	}
}

class Account extends Object{
	String name;
	String number;
	int money;
	
	public Account() {
		super();
	}

	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //매개변수의 다형성과 함께 생각해볼것
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	
	
}
