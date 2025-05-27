package ifexample;

// 나 혼자 코딩
// switch-case 문 연습하기
/*
    5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽 입니다.
    건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있다고 할 때,
    앞의 예제를 참고해서 switch-case 문으로 구현해 보세요.
    (5인 경우 '5층 헬스 클럽입니다.' 라고 출력.)
 */
public class SwitchCase3 {
    public static void main(String[] args) {
        int floor = 5;
        String building = "";

        switch (floor) {
            case 1:
                building = "1층 ";
                break;
            case 2:
                building = "2층 ";
                break;
            case 3:
                building = "3층 ";
                break;
            case 4:
                building = "4층 ";
                break;
            case 5:
                building = "5층 ";
                System.out.println("5층 입니다.");
                break;
                
        }
        System.out.println("floor : " + floor + "층 - " + building + "입니다.");


    }
}
