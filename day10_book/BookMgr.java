package day10_book;

public class BookMgr {

	Book[] bookList =null; //bookList 배열을 멤버변수/ =>예외 발생, 생성자 함수 고민
	int cnt = 0; //몇개의 데이타가 있는지
	
	public BookMgr(){
		bookList = new Book[10]; //10개짜리 방
	}//기본생성자, 클래스명과 동일, 
	//일반 메서드와 다름. 생성자 함수는 리턴타입 언급시 에러
	
	public BookMgr(int size){
		bookList = new Book[size]; //언급하지 않으면 10개, 아니면 입력값
	}// bookList이라는 배열 변수를 초기화하는 생성자 메서드
	
	//book 객체를 booklist에 등록
	public void addBook(Book book) {
		if(cnt == bookList.length) {
			Book[] temp = new Book [bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
			temp = null;
		}//resizing code, collection 맛보기
		bookList[cnt] = book;
		cnt++;
	} 
	
	//책 목록을 화면에 출력
	public void printBookList() {
		System.out.println("************* Book List *************");
		for(int i=0;i <cnt ;i++) {
			bookList[i].print();
		}
	}
	
	//모든 책 가격의 합을 출력
	public void printTotalPrice() {
		
		int sum=0;
		for(int i=0;i <cnt ;i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println("총합계 : " + sum);
	}
	
	//검색 도서 입력
	public void printSearchTitle(String title) {
		System.out.println("************ 검색 결과 ************");
		for (int i = 0; i < cnt; i++) {
			if(bookList[i].getTitle().toLowerCase().contains(title.toLowerCase())) 
			bookList[i].print();
		}
	 } 
	
	}