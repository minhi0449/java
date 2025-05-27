package ifexample;

// if-else if-else 문으로 입장료 계산하기
public class IfExample2 {
    public static void main(String[] args) {
        int age = 9;
        int charge;

        if (age < 8){ // 8살 미만
            charge = 1000;
            System.out.println("취학 전 아동 입니다.");
        } else if (age < 14){ // 8살 이상 14살 미만
            charge = 2000;
            System.out.println("초등학생 입니다.");
        } else if (age < 20){ // 14살 이상 20살 미만
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        // age >= 8 && age < 14 라고 작성하지 않고
        // age < 14 라고 작성한 이유
        // if-else if-else 문은 하나의 조건을 만족하면
        // 다른 조건은 더 이상 비교하지 않는다.

        // 즉, 이미 9행의 조건에서 (age < 8) 을 비교했기 때문에
        // 이 조건식에 의해 모두 처리된 것
        // 따라서 다음 조건식인 (age < 14)는 당연히 8살 이상인 경우를 포함하므로
        // age < 14 라고만 작성 가능

        System.out.println("입장료는 '" + charge + "' 원입니다.");
        // 출력문에서 +를 사용하면 여러 단어를 연결하여 출력할 수 있음
    }
}
