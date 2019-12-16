package day10_book;

public class Book { 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	private String title;
	private int price; //1 멤버변수 선언, 캡슐화(private : same class)
	
	public Book() {
		//super(); //부모의 기본 생성자를 호출하는 문장(source>generate)
	}

	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}//4 생성자 메서드
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	} //3 setter, getter (set get method)
	
	public void print() {
		System.out.printf("[제목 : %-10s 가격 : %6d] %n" , title, price);
	}//2

}
