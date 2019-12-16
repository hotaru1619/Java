package day08;

public class Test02 {
	public static void main(String[] args) {
		//SingleTone s = null;
		SingleTone s = SingleTone.getInstance(); 

		SingleTone s1 = SingleTone.getInstance(); 
		SingleTone s2= SingleTone.getInstance(); 
		SingleTone s3 = SingleTone.getInstance(); 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//last code(private => private static)
		//last code(public => public static)
	}
}

class SingleTone{
	private static SingleTone s ;
	private SingleTone(){} 
	//생성자 함수의 접근 지정자가 private => (same class)
	public static SingleTone getInstance() {
		if(s==null) s= new SingleTone();
		return s;
		//getInstance : instance 만들어주는 메소드
		//private SingleTone s; => 주소없이 메소드 호출하려면 static 필요
		//static(공유 개념) this자원 사용 불가
	}
}
