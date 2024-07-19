package sub2;

public class Cheer {

	String title;
	String author;
	String isbn;
	int availableCopies;
	
	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
	
	public void show() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("저자 이름 : " + this.author);
		System.out.println("ISBN 번호 : " + this.isbn);
		System.out.println("이용 가능한 복사본 수 : " + this.isbn);
	}	
}
