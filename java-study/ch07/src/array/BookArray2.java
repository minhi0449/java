package array;

// 객체 배열 만들기(3)
public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        // 인스턴스 생성 후 배열에 저장
        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("어떻게 살 것인가", "유시민");
        library[3] = new Book("토지", "박경리");
        library[4] = new Book("어린왕자", "생택쥐페리");

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }


        /*
            [출력 결과]

            >> Book 인스턴스 멤버들
            태백산맥, 조정래
            데미안, 헤르만 헤세
            어떻게 살 것인가, 유시민
            토지, 박경리
            어린왕자, 생택쥐페리

            >> Book 인스턴스를 저장한 메모리 공간 주소
            array.Book@279f2327
            array.Book@2ff4acd0
            array.Book@54bedef2
            array.Book@5caf905d
            array.Book@27716f4
         */
    }
}
