package day09;

public class Test09 {
	public static void main(String[] args) {
		Account account = new Account("홍길동", "001", 1000);
		try {
			account.output(7000);	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			//고객 화면에 보여져야 하기 때문에 이 위치에서 메시지 핸들링 필요(try catch)
		}
	}
}

class MoneyException extends Exception{
	MoneyException() {
		super("계좌잔고예외발생");
	}
	MoneyException(String msg){
		super(msg);
}
}

class Account extends Object{
	String name;
	String number;
	int money;
	
	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}
	
	public void input(int money) {
		this.money += money;
	}
	
	public void output(int money) throws MoneyException{
		if(this.money<money) throw new MoneyException();
		this.money -= money;
	}//사용자정의 MoneyException 위에서 생성 후 여기에 적용함. 핸들링은 main에서

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
	public boolean equals(Object obj) {
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
