package day07;

public class Test04 {
	public static void main(String[] args) {

//		Fish f = new Fish("쿠피");
		Animal f = new Fish("쿠피");
		((Fish)f).print();
		System.out.println(f.kind);
		System.out.println(((Fish)f).kind);
		
		//((Fish)f).breath();
		f.breath();//수행했더니 아가미로 나옴. 메서드 오버라이딩
		
	}

}
