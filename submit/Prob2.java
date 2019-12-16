package submit;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
//		System.out.println('x'-'a'); //23
//		System.out.println('d'-'a'); //3
			
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = ""; //length : 0
			
		StringBuilder sb = new StringBuilder(); //+연산 사용 배제
				// 프로그램을 구현부 시작.	
				// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		
		for(int i=0; i<sourceString.length();i++) {
			char c = sourceString.charAt(i);
			//암호화 작업
			//a~w : +3, x,y,z : -23, 그 외 공백
//			if(c>='a'&&c<='w') {
//				c=(char)(c+3);
//			}else if(c>='x'&&c<='z') {
//				c=(char)(c-23);
//			}
			
			c = c>='a'&&c<='w'? (char)(c+3):c>='x'&&c<='z'? (char)(c-23) :c ;
			
		//encodedString = encodedString+c; //성능저하코드, 스트링빌더
			
			sb.append(c);
		}		
		
		 encodedString = sb.toString(); //객체의 스트링화
		
		 // 프로그램 구현부 끝.		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
	}

}
