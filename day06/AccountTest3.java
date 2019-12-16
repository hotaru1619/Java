package day06;

import javax.swing.JOptionPane;

public class AccountTest3 {
	public static void main(String[] args) {

		Account[] accounts = 
			{new Account("2019-12-09-001", "홍길동", 10),
			 new Account("2019-12-09-008", "choi", 7000),	
			 new Account("2019-12-09-009", "김길동", 10000),
			 new Account("2019-12-09-018", "최길동", 55000),
			 new Account("2019-12-09-020", "고길동", 6500),
			 new Account("2019-12-09-023", "이길동", 70000)
		};
		System.out.println("Account List");
		for(int i=0; i<accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("Account 검색");
		String name = JOptionPane.showInputDialog("검색이름을 입력하세요");
		for(int i=0; i<accounts.length; i++) {
			if(name.trim().equalsIgnoreCase(accounts[i].getName())) {
			accounts[i].print();
			}
		}
		
	}

}
