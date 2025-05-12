package _object;


import java.util.Objects;

/*
    Object 최상위 클래스에 대한 이해
    기본적으로 Object 클래스 상속을 받는다.
    자바는 Object 클래스(모든 클래스의 최상위 클래스)를 제외하고,
    단일 상속만을 제공합니다.
 */
public class Book {

    private int bookTypeId;
    private String title;  // 책 제목
    private String author; // 저자

    public Book(int bookTypeId, String author, String title) {
        this.bookTypeId = bookTypeId;
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
            // BooK 타입이 맞다면 추가적으로 , 제목이 같다면 같은 책으로 판단하겠다
            // this.제목 == obj.제목 && this.저자 == obj.저자

            if(this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author)) {
                return true;
            } else {
                return false;
            } // end of &&
        } else {
            return false;
        } // end of if(obj instanceof Book)

    } // end of equals


    // equals() 메서드를 정의할 때는 hashCode() 메서드 재정의 해주어야
    // 의도하지 않은 동작을 막을 수 있다.


//    자동완성 (cmd + n)
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return bookTypeId == book.bookTypeId && Objects.equals(title, book.title) && Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(bookTypeId, title, author);
//    }

    // 테스트 코드
    public static void main(String[] args) {
        // 물리적 객체 주소값은 다르지만 equals() 메서드를 재정의해서
        // 논리적으로 책 이름과 저자 이름이 같으면 같은 녀석으로 바라보게
        // 프로그램 만들기

        // 책 제목과 저자 이름이 같다면 논리적으로 같은 책으로 판별
        Book book1 = new Book(1, "데미안", "헤르만헤세");
        Book book2 = new Book(2, "데미안", "헤르만헤세");
        Book book3 = new Book(3, "데미안", "헤르만헤세");
        Book book4 = new Book(4, "데미안", "헤르만헤세");

        String str = new String("데미안");

        System.out.println();
        System.out.println("book1.toString() : " + book1.toString());
        System.out.println("book2.toString() : " + book2.toString());

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(str);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);

        System.out.println("------------------------------------------------");
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);

    } // end of main
} // end of class (Book)
