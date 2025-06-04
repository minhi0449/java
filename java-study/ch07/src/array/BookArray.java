package array;

// 객체 배열 만들기 (2)
public class BookArray {
    public static void main(String[] args) {
        // Book 클래스형으로 객체 배열 생성
        Book[] library = new Book[5];
        // 이 문장 실행하면 Book 주소 값을 담을 공간이 5개 만들어지고,
        // 자동으로 각 공간을 '비어 있다'는 의미의 null 값으로 초기화 됩니다.

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
