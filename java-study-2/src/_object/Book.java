package _object;

import dot.B;

/*
    Object 최상위 클래스에 대한 이해
    기본적으로 Object 클래스 상속을 받는다.
    자바는 Object 클래스(모든 클래스의 최상위 클래스)를 제외하고,
    단일 상속만을 제공합니다.
 */
public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // showInfo();
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

//    public String toString() {
//        return "title : " + title + " , " + "author : " + author;
//    }

    // 테스트 코드
    public static void main(String[] args) {
        Book book1 = new Book("데미안", "헤르만헤세");
        System.out.println("book1.toString() : " + book1.toString());
    }

}
