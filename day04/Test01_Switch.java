package day04;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test01_Switch {
	public static void main(String[] args) throws Exception {
		System.out.println("APP 시작...");
		String name = null;
		int kor, eng, math; 
		Scanner scanner = 
				new Scanner(new FileInputStream("c://lib/score.txt"), "UTF-8");

		name= scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine(); //ent 소진
				
		double sum = kor+eng+math;
		double avg = sum/3;
		
		System.out.printf("이름=%s %n", name);
		System.out.printf("국어=%d 영어=%d 수학=%d", kor, eng, math);
		System.out.printf("평균=%.2f ", avg);
		//학점 처리 A B C D F
		char grade = 'F';
		switch((int)avg/10) { //100가지 분기, 0~100까지 케이스 구문, 범위x, 경우의 수 줄임(/10)		
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';		
			break; //생략가능
		}
		
//		if(avg>=90) {
//			grade = 'A';
//		}else if(avg>=80) {
//			grade = 'B';
//		}else if(avg >=70) {
//			grade = 'C';
//		}else if (avg>=60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
		
		
		System.out.printf("grade=%c 학점 %n", grade);
		
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("분발");
			break;
		case 'D':
			System.out.println("노력");
			break;
		default:
			System.out.println("재수강 대상입니다.");
			break;
		}
		
		//if(scanner != null)scanner.close();
		//scanner = null;
		return;
	}

}
