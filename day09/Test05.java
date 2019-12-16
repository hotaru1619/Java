package day09;

public class Test05 {
	public static void main(String[] args) {

		System.out.println("start");

		String msg = "-5"; //"백";  java.lang.NumberFormatException
		//"백";  java.lang.ArithmeticException
		//"-5"; java.lang.NegativeArraySizeException
		int num =0;
		int res =0;
		
		try {
			num = Integer.parseInt(msg);//msg=>int
			res =1000/num;
			int[] number = new int [num];
			//java.lang.NegativeArraySizeException, 배열은 음수(크기)로 만들수 없음.
			//자원반납코드 X
		}catch (NumberFormatException e) {
			System.out.println("문제 발생: " +e);
			System.out.println("숫자로 입력된 문자열로 입력하세요");
		}catch (ArithmeticException e){
			System.out.println("0을 제외한 숫자로 입력된 문자열로 입력하세요");
		}catch (Exception e) { //위의 예외 이외의 모든 예외
			//e.printStackTrace(); //예외 정보 추적해서 찍어~
			//예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지 화면 출력
			//System.out.println(e.getMessage());//null
			//발생한 예외클래스의 인스턴스에 저장된 메시지 get
			//System.out.println(e);			
			System.out.println("문제 발생~~");
		}finally {
			System.out.println("자원반납코드 항상 수행"); //예외발생유무와 관계없이 수행됨.
		}//try
		
		System.out.println(num);
		System.out.println(res);
		System.out.println("end");
		
		
	}

}
