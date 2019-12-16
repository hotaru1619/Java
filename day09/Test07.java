package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import submit.Book;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("----------START-------------");
		Scanner scanner = null;//자원반납
		
		try {
			scanner = new Scanner(new File("bookdata.txt"));
			while(scanner.hasNextLine()) {
				String [] data = scanner.nextLine().split(" ");
				Book book = new Book(data[0], Integer.parseInt(data[1]));
				System.out.println(book);
			}//hasNextLine() : 읽을 내용을 가지고 있음.
			//공백을 기준으로 데이터를 쪼개기 => 배열
			//Integer.parseInt : String-> int로
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("bookdata.txt 파일 확인 해 주세요");
		}finally {
			//scanner.close();
			//자원반납, END안나옴.NullPointerException, scanner 주소 없음.
			//try가 실패했기 때문에 scanner가 null상태, 반납할 자원이 없음.
			if(scanner != null) scanner.close();
		}
		
		System.out.println("-----------END-------------");
	}
}
