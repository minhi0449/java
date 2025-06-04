package array;

// 객체 배열의 얕은 복사
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        // 초기 상태 확인
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        System.out.println("\n=== bookArray1 ===");
        // bookArray1 배열의 첫 번째 요소 값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("\n=== bookArray2 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            // bookArray2 배열 요소 값도 변경되어 출력
            bookArray2[i].showBookInfo();
        }

    }
}
