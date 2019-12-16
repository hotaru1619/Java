package day02;

public class Test03 {

	public static void main(String[] args) {
		int pw = 0;
		System.out.println(pw);
		pw = " hello1234 ".trim().length();//trim String에서 공백제거하는 method
		pw = " hello1234 ".trim().toUpperCase().length();
		System.out.println(pw);
		System.out.println(pw>8);
		pw = 0; //재초기화
		System.out.println("---------------------");
		String msg = null;
		System.out.println(msg);
		msg = "hello java~~~~";
		System.out.println(msg);
		String msg2 = msg;
		msg = null;
		msg2 = null;
		
	}

}
