package submit;

public class Prob3 {
	public static void main(String[] args) {

	String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };	
	//배열 선언, 생성 및 초기화
	//String은 내부적으로 char 타입의 배열 char[] c;
	
	//String[] strData; //배열 선언
	//strData = new String[4]; // 배열 생성
	//strData[0]="Java Programming";
	//strData[1]="JDBC";
	//strData[2]="Oracle10g";
	//strData[3]="JSP/Servlet"; // 배열 초기화
	
//	for(int j=0; j<strData.length; j++) {
//		for(int i=1; i<=strData[j].length(); i++) {
//			System.out.print(strData[j].charAt(strData[j].length()-i));
//			}
//		System.out.println();
//	}
	
	for(int i=strData.length-1; i>=0; i--) { //배열의 사이즈
		for(int j=strData[i].length()-1; j>=0; j--) {  //문자열의 사이즈 ()
			System.out.print(strData[i].charAt(j));
		}
		System.out.println();
	}
	
	
	}

}
