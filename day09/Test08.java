package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import submit.Book;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("----------START-------------");
		
		try(Scanner scanner = new Scanner(new File("bookdata.txt"));) {
			StringTokenizer st = null;
			while(scanner.hasNextLine()) {
				//String [] data = scanner.nextLine().split(" ");
				st = new StringTokenizer(scanner.nextLine());
				//한줄읽었음.
				String title = st.nextToken();
				int price = Integer.parseInt(st.nextToken());
				Book book = new Book(title, price);
				// public StringTokenizer(String str) {
		        //this(str, " \t\n\r\f", false);
				//}
				
				//Book book = new Book(data[0], Integer.parseInt(data[1]));
				System.out.println(book);
			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일 확인 해 주세요");
		}finally {
			
		}
		
		System.out.println("-----------END-------------");
	}
}
