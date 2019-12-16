package day06;

public class Test02 {
	public static void main(String[] args) {
		Time t1 = new Time();
		//t1.hour = 13; private으로 인해 사용 불가능
		t1.setHour(-13);
		//t1.minute = 30;
		t1.setMinute(30);
		
		t1.print();
		
	}

}

class Time{
	private int hour; //private 그 영역 내에서만 접근이 가능함. 상기 t1.hour 사용 불가 
	private int minute;
	private int second;
	
	//통로 마련
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		//조건 체크
		if(hour >= 0 && hour <24) this.hour = hour; //좌 : 멤버, 우: 로컬  멤버에 this.필요
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute >= 0 && minute <59) this.minute = minute;
	}
	
	public void print() {
		System.out.printf("(%d시: %d분: %d초) %n", this.hour, this.minute, this.second);
	}
}