package day10_book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class BookMgr_Collection {
	public static void main(String[] args) {

		List<String> list =new <String> ArrayList();
		
		list.add("java");
		list.add("sql");
		list.add("MySQL");
		list.add("JSP");
		list.add("javascript");
		list.add("Spring");
		list.add("Software");
		
		//목록
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
	
		//검색
			String keyword = JOptionPane.showInputDialog("검색어를 입력하세요");
			System.out.println( keyword  + "도서 검색 결과");
			it = list.iterator();			
			while (it.hasNext()) {
				if(list.contains(keyword.toUpperCase()))  {
					System.out.println(list);
					}
			}
	
	}
}

