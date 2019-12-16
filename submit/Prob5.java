package submit;


public class Prob5 {
	public static void main(String[] args) {
		
		Prob5 p5 = new Prob5();//*
		
		System.out.println( Prob5.leftPad("SDS", 6, '#') );
		System.out.println( Prob5.leftPad("SDS", 5, '$') ); 
		System.out.println( Prob5.leftPad("SDS", 2, '&') ); 
		
		System.out.println(p5.rightPad("SDS", 7, '&') ); //*
	
	}
	
	
	// static method : 클래스 메소드 => 클래스 네임으로 접근
	public static String leftPad(String str, int size, char padChar) {
		
		StringBuilder sb = new StringBuilder();
		int count = size-str.length();
		for(int i=0 ; i<count; i++) {
			//str = padChar + str; //Stringd에 +연산 사용하지 말 것. StringBuilder 사용
			sb.append(padChar);
		}
		
		sb.append(str);
		return sb.toString();
	}
	// static 키워드 없는 instance method : new를 이용 instance화 한 후 주소를 이용하여 접근
	public String rightPad(String str, int size, char padChar) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		for(int i=0 ; i<size-str.length(); i++) {
			sb.append(padChar);
		}
		
		return sb.toString();
		
	
	}

}
