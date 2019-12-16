package day03;

import java.util.Scanner;

public class Test03_Scanner{
	public static void main(String[] args) {
		String name = null;
		int kor =0;
		int math =0;
		//System.out.println(name.length());
		//NullPointerException발생=>10행을 name assign된 다음에
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		System.out.println("이름을 입력하세요_");
		name = scanner.nextLine();//커서
		System.out.println(name.length());
		System.out.println("국어 점수를 입력하세요_");
		kor = Integer.parseInt(scanner.nextLine());//형변환
		System.out.println("수학 점수를 입력하세요_");
		math = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("이름: %s 국어 : %d 수학 : %d %n", name, kor, math);
		double avg = (kor+math)/2.;
		System.out.println(avg+": " + (avg>=80? "합격" : "불합격"));
		
		scanner.close(); //자원반납
		scanner = null; //gc의 대상
		return;
		
	}

}
