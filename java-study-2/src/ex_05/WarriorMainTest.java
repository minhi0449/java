package ex_05;

// 3. 객체에 값 할당하기
public class WarriorMainTest {

    // 메인 메소드 (코드의 시작점) - (JVM Stack)
    public static void main(String[] args) {
        // new - 키워드, () - 생성자
        Warrior warrior1 = new Warrior();
        // warrior1 객체에 접근해서 값을 할당해 보자.
        // 객체의 접근은 . 연산자로 할 수 있다.

        Warrior warrior2 = new Warrior();
        warrior1.name = "";
        warrior1.height = 200;
        warrior1.weight = 50;

        System.out.println("-----------------------");
        warrior2.name = "전사2";
        warrior2.health = 120;
        warrior2.attackPower = 50;
        warrior2.defensePower = 10;
        warrior2.height = 200;
        warrior2.weight = 180;
        System.out.println("-----------------------");

        // 변수로 접근해서 해당 객체의 정보를 화면에 출력
        System.out.println("warrior1.name : " + warrior1.name);
        System.out.println("warrior2.name : " + warrior2.name);

        // warrior1 의 멤버 변수 name 접근해서 문자열 값을
        // [전사1] 이라고 값 넣어보기

        warrior1.name = "전사1";
        System.out.println("warrior1.name : " + warrior1.name);
    }
}
