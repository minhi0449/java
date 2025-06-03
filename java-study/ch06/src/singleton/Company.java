package singleton;

public class Company {
    // 유일하게 생성한 인스턴스
    private static Company instance = new Company();
    private Company(){} // private 생성자 만들기

    // 외부에서 참조할 수 있는 public 메서드 만들기
    // 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance; // 유일하게 생성한 인스턴스 반환
    }

}
