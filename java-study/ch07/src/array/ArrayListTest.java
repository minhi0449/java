package array;

import java.util.ArrayList;

// ArrayList 클래스 사용하기
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>(); // ArrayList 선언

        // add() 메서드로 요소 값 추가
        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));

        // 배열에 추가된 요소 개수만큼 출력
        for (int i = 0; i < library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("---- 향상된 for 문 사용 ----");
        for (Book book : library){
            book.showBookInfo();
        }

    }
}
