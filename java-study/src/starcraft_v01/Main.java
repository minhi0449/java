package starcraft_v01;

public class Main {

    public static void main(String[] args) {

        // 각 유닛 생성
        Zealot zealot1 = new Zealot("질럿1");
        Zergling zergling1 = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");

        // 각 유닛 정보 출력
        zealot1.showInfo();
        zergling1.showInfo();
        marine1.showInfo();

        System.out.println("\n ---- 전투 시작 ---- \n");

        // 공격 테스트
        zealot1.attackZergling(zergling1);
        zergling1.attackZealot(zealot1);
        marine1.attackZealot(zealot1);

        // 전투 후 상태 확인
        System.out.println(" \n ---- 전투 후 상태 ---- \n");
        zealot1.showInfo();
        zergling1.showInfo();
        marine1.showInfo();

    }
}
