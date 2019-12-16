package submit;

import javax.swing.JOptionPane;

public class BookApp {
	public static void main(String[] args) {
		//북 매니저 동작시켜야 함.
		BookMgr mgr = new BookMgr(3); //기본 10개 배열 가짐.
		
		Book book = new Book("java", 33000);
		mgr.addBook(book); //[0] =>cnt++ => cnt1
		
		mgr.addBook(new Book ("SQL", 22000));	//=>cnt2
		mgr.addBook(new Book ("HTML5", 27000));	//=>cnt3
		
		mgr.addBook(new Book ("Oracle", 27000)); //=>cnt4=>resizing(check)
		
		mgr.printBookList();
		mgr.printTotalPrice();
		
		//사용자 입장 검색창 필요, 검색 키워드 필요
		String title = JOptionPane.showInputDialog("검색할 도서를 입력하세요");
		mgr.printSearchTitle(title);
		//mgr.printSearchTitle(title.toUpperCase());도 가능한지 test
		
	}

}
