package day06;
/**
 * 
 * @author 최영신
 * @since 2019.12
 */
public class Account {
		private String name;
		private String number;
		private int money; //1.멤버변수
		
		public Account() {
		this("","",0); 
		//c+click 호출경로파악, 나와 똑같은 생성자 함수 호출하는 함수. "첫라인"에만 허용되는 문장
		//System.out.println("Account() 기본 생성자 수행"); //초기화 작업 수행 null null 0	
//		setNumber("");
//		setName("");
//		setMoney(0); //[ () 잔고 : 0 ] AccountTest02 , 코드 중복. this가 처리
		}
		
		public Account(String number, String name, int money) {
			setNumber(number);
			setName(name);
			setMoney(money);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		/*money 입금금액*/
		public void input(int money){ // 메소드 선언부 {구현부}
			this.money += money;
			return;
		}
		
		/*출금*/
		public int output(int money){
			if(this.money >= money) {
				this.money -= money;
				return money;
			}else {
				return 0;
			}	
		}
		
		public void print(){
			System.out.printf("[%s (%s) 잔고 : %7d원 ]%n", number, name, money);
			return;
		}
		
		
		/**
		 * 
		 * @param from 출금계좌
		 * @param to   입금계좌
		 * @param money 계좌이체 금액
		 */
		public static void transfer(Account from, Account to, int money) {
			System.out.println("계좌이체");
			System.out.println(from.number+ " ->" + to.number);
			to.input(from.output(money));
		}
}

