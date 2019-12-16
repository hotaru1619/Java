package day06;

public class AccountTest {
	public static void main(String[] args) {
		Account a1= new Account(); //Account() 기본 생성자 수행
		a1.setNumber("2019-12-09-001");
		a1.setName("홍길동");
		a1.setMoney(10);
		a1.print();
		Account a2= new Account();
		a2.setNumber("2019-12-09-008");
		a2.setName("choi");
		a2.setMoney(7000);
		a2.print();
		
		//a1.input(a2.output(2000));//계좌이체
		Account.transfer(a2, a1, 2000); //static, 클래스 메소드, 클래스 네임
		
		a1.print();
		a2.print();
	}

}
