package day09;

public class Test06 {
	public static void main(String[] args) {

		System.out.println("start");

		try {
			Thread.sleep(7000); //start 7second end
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------");
//		new Exception("예외 실습~~~"); //예외 객체 생성
//		throw new RuntimeException("예외 실습~~~"); //
		try {
			throw new Exception("예외 실습~~~");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		
		
		System.out.println("end");
		
		
	}

}
