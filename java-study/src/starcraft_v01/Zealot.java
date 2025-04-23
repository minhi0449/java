package starcraft_v01;

/**
 * @author 김민희
 */
public class Zealot {

    private String name;    // 질럿의 이름을 저장하는 변수 (private: 외부에서 직접 접근 불가)
    private int power;      // 질럿의 공격력을 저장하는 변수
    private int hp;         // 질럿의 체력을 저장하는 변수

    public Zealot(String name){    // 생성자(Constructor): 객체가 생성될 때 호출되는 메소드
        this.name = name;          // 매개변수로 받은 name을 객체의 name에 할당
        this.power = 5;            // 질럿의 기본 공격력은 5로 설정
        this.hp = 80;              // 질럿의 기본 체력은 80으로 설정
    }

    // read only --> getter (읽기 전용 접근자 메소드)
    // getter : private 필드의 값을 반환하는 메소드
    public String getName(){       // 이름을 반환하는 getter 메소드
        return name;
    }

    public int getPower(){         // 공격력을 반환하는 getter 메소드
        return power;
    }

    public int getHp(){            // 체력을 반환하는 getter 메소드
        return hp;
    }

    // 질럿의 'attackZergling' 메소드는 저글링의 'beAttacked' 메소드를 호출
    public void attackZergling(Zergling zergling){   // 저글링을 공격하는 메소드
        zergling.beAttacked(this.power);            // 저글링의 beAttacked 메소드를 호출하여 데미지 적용
        System.out.println(name + " 이 " + zergling.getName() + "을 공격합니다.");
    }

    public void attackMarine(Marine marine){        // 마린을 공격하는 메소드
        marine.beAttacked(this.power);              // 마린의 beAttacked 메소드를 호출하여 데미지 적용
        System.out.println(name + " 이 " + marine.getName() + "을 공격합니다.");
    }

    public void beAttacked(int power){              // 공격을 받는 메소드
        if (this.hp <= 0){                          // 체력이 0 이하인지 확인
            System.out.println(name + " 이(가) 사망하였습니다.");
            // 실행에 제어권을 반납하고 싶으면 키워드 !! (돌아가)
            // 'beAttacked' 메소드에서 체력이 0 이하이면 return; 으로 메소드 종료
            return;                                 // 메소드 실행을 중단하고 호출자에게 제어권 반환
        }
        this.hp -= power;                           // 체력에서 받은 데미지만큼 감소
        System.out.println(name + "이(가) 공격을 당합니다.");
    }

    public void showInfo(){                         // 질럿 정보를 출력하는 메소드
        System.out.println("----- ✦ Zealot 상태창 ✦ ----- ");
        System.out.println("질럿 이름 : " + name);
        System.out.println("질럿 공격력 : " + power);
        System.out.println("질럿 체력 : " + hp);
    }
}